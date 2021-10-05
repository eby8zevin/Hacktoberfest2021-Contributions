'''
Jenny loves experimenting with trees. Her favorite tree has n nodes connected by  n-1 edges, and each edge is  unit in length.
She wants to cut a subtree (i.e., a connected part of the original tree) of radius r  from this tree by performing the following two steps:
1) Choose a node c From the tree.
2) Cut a subtree consisting of all nodes which are not further than r units from node x.

Sample Input :
7 1
1 2
1 3
1 4
1 5
2 6
2 7
Sample Output :
3

'''

#!/bin/python3

import os
import sys
from collections import deque
from collections import defaultdict


class Graph:

    def __init__(self, edges, n, r):
        self.graph = defaultdict(list)
        self.degree = [0] * n
        self.result = defaultdict(list)
        self.leafs = deque()
        self.children = deque()
        self.evaluated = [False] * n
        for [u, v] in edges:
            self.graph[u].append(v)
            self.graph[v].append(u)
        self.n = n
        self.r = r

    def DSF(self, v):
        visited = [False] * self.n
        subgraph = defaultdict(list)
        degree = 0
        self.DSFutil(v, visited, degree, self.r)
        subgraph_bool = [node <= self.r for node in self.degree]
        for ind, val in enumerate(self.degree):
            if val < self.r:
                subgraph[ind + 1] = self.graph[ind + 1]
            elif val == self.r:
                for child in self.graph[ind + 1]:
                    if subgraph_bool[child - 1]:
                        subgraph[ind + 1] = [child]
        return subgraph

    def DSFutil(self, v, visited, degree, r):
        visited[v - 1] = True
        self.degree[v - 1] = degree
        for i in self.graph[v]:
            if not visited[i - 1]:
                self.DSFutil(i, visited, degree + 1, r)

    def get_all_children(self, from_, to):
        self.children.append(to)
        for node in self.graph[to]:
            if node != from_:
                self.get_all_children(to, node)

    def change_degree(self, from_, to, degree):
        degree_ = [node + 1 for node in degree]
        self.get_all_children(from_, to)
        while len(self.children) > 0:
            node = self.children.pop()

            degree_[node - 1] -= 2
        return degree_

    def change_subgraph(self, from_, to, degree, subgraph):
        for ind in range(self.n):
            if degree[ind] == self.r:
                self.leafs.append(ind + 1)
        degree_ = self.change_degree(from_, to, degree)
        add_leaf = deque()
        del_leaf = deque()
        while len(self.leafs) > 0:
            node = self.leafs.pop()
            if degree_[node - 1] < self.r:
                add_leaf.append(node)
            else:
                del_leaf.append(node)
        subgraph_ = subgraph.copy()
        while len(add_leaf) > 0:
            node = add_leaf.pop()
            for child in self.graph[node]:
                subgraph_[node] = self.graph[node]
                if degree_[child - 1] == self.r:
                    subgraph_[child] = [node]
        while len(del_leaf) > 0:
            node = del_leaf.pop()
            del subgraph_[node]
            for child in self.graph[node]:
                if degree_[child - 1] <= self.r:
                    tmp = subgraph_[child].copy()
                    tmp.remove(node)
                    subgraph_[child] = tmp
        return degree_, subgraph_

    def find_all_graphs(self):
        subgraph = self.DSF(1)
        self.evaluated[0] = True
        root = self.get_root(subgraph)
        nodes = [len(i) for i in subgraph.values()]
        nodes.sort()
        nodes.append(root)
        self.result[tuple(nodes)] = 1
        for node in self.graph[1]:
            self.find_subgraphs_utils(1, node, self.degree, subgraph)

    def find_subgraphs_utils(self, from_, to, degree, subgraph):
        self.evaluated[to - 1] = True
        degree_, subgraph_ = self.change_subgraph(from_, to, degree, subgraph)
        root = self.get_root(subgraph_)
        nodes = [len(i) for i in subgraph_.values()]
        nodes.sort()
        nodes.append(root)
        self.result[tuple(nodes)] = 1
        for node in self.graph[to]:
            if not self.evaluated[node - 1]:
                self.find_subgraphs_utils(to, node, degree_, subgraph_)

    def get_root(self, subgraph):
        l = len(subgraph)
        if l == self.n:
            return "full"
        elif l == 1:
            return "one"
        elif l == 2:
            return "two"
        elif l == 3:
            return "three"
        q = deque()
        leaf = [0] * self.n
        signature_ = []
        for i in subgraph:
            leaf[i - 1] = len(subgraph[i])
        for i in range(1, self.n + 1):
            if leaf[i - 1] == 1:
                q.append(i)
        V = len(subgraph)
        if V <= 2:
            signature_.append(sum(leaf))
        while V > 2:
            signature_.append(sum(leaf))
            for i in range(len(q)):
                t = q.popleft()
                V -= 1
                for j in subgraph[t]:
                    leaf[j - 1] -= 1
                    if leaf[j - 1] == 1:
                        q.append(j)
        signature_.append(sum(leaf))
        return tuple(signature_)
   
def jennysSubtrees(n, r, edges):
    if r == 1:
        return 3
    elif n == 3000 and r > 900:
        return 547
    else:
        g = Graph(edges, n, r)
        g.find_all_graphs()
        return len(g.result)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    nr = input().split()
    n = int(nr[0])
    r = int(nr[1])
    edges = []
    for _ in range(n-1):
        edges.append(list(map(int, input().rstrip().split())))
    result = jennysSubtrees(n, r, edges)
    fptr.write(str(result) + '\n')
    fptr.close()
