#include<math.h>
#include<stdio.h>
#include<stdlib.h>
#include "bintree.h"
void preOrder(Node *a){
    if(a!=NULL){
        printf("%c ",a->data);
        preOrder(a->left);
        preOrder(a->right);
    }
}
void inOrder(Node *a){
    if(a!=NULL){
        inOrder(a->left);
        printf("%c ",a->data);
        inOrder(a->right);
    }
}
void postOrder(Node *a){
    if(a!=NULL){
        postOrder(a->left);
        postOrder(a->right);
        printf("%c ",a->data);
    }
}
int main(){
    int opt;
    while(1){
        printf("Binary Tree\n1 create tree\n2 preorder\n3 inorder\n4 postOrder\n5 Exit");
        scanf("%d",&opt);
        fflush(stdin);
        if(opt>4)
            break;
        switch(opt){
            case 1:
                createTree();
                break;
            case 2:
                printf("PreOrder\n");
                preOrder(rt);
                break;
            case 3:
                printf("Inorder\n");
                inOrder(rt);
                break;
            case 4:
                printf("postOrder\n");
                postOrder(rt);
                break;
        }
        printf("\n");
    }
}
