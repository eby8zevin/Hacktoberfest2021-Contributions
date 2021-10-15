# include <stdio.h>
# include <malloc.h>
struct node
{
int coeff;
int exp;
struct node *next;
};

struct node *addition(struct node *,struct node *);
struct node *list(struct node *);
struct node *insert(struct node *,int,int);
void display(struct node *);

void main( )
{
struct node *p_start,*q_start,*r_start;

p_start=NULL;
q_start=NULL;
r_start=NULL;

printf("Polynomial 1 :\n");
p_start=list(p_start);

printf("Polynomial 2 :\n");
q_start=list(q_start);

r_start=addition(p_start,q_start);

printf("Polynomial 1 is : ");
display(p_start);
printf("Polynomial 2 is : ");
display(q_start);
printf("Resultant polynomial is : ");
display(r_start);
}

struct node *list(struct node *start)
{
int i,n,ex;
int co;
printf("How many terms u want to enter : ");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
printf("Enter coefficient for term %d : ",i);
scanf("%d",&co);
printf("Enter exponent for term %d : ",i);
scanf("%d",&ex);
start=insert(start,co,ex);
}
return start;
}

struct node *insert(struct node *start,int co,int ex)
{
struct node *ptr,*tmp;
tmp= (struct node*)malloc(sizeof(struct node));
tmp->coeff=co;
tmp->exp=ex;

if(start==NULL || ex>start->exp)
{
tmp->next=start;
start=tmp;
}
else
{
ptr=start;
while(ptr->next!=NULL && ptr->next->exp>ex)
{
ptr=ptr->next;
}
tmp->next=ptr->next;
ptr->next=tmp;

}
return start;
}

struct node *addition(struct node *p_start,struct node *q_start)
{
   struct node *r_start,*tmp,*p;
   r_start=NULL;
   if(p_start==NULL && q_start==NULL)
   return r_start;

   else if(p_start!=NULL && q_start==NULL)
          {
              while(p_start!=NULL)
                {
 tmp=(struct node *)malloc(sizeof(struct node));
 tmp->coeff=p_start->coeff;
 tmp->exp=p_start->exp;
 if (r_start==NULL)
 {
 r_start=tmp;
 p=tmp;
 }
 else
 {
 p->next=tmp;
 p=tmp;
 }
 p_start=p_start->next;
 }
          }

     else if(p_start==NULL && q_start!=NULL)
          {
              while(q_start!=NULL)
                  {
 tmp=(struct node *)malloc(sizeof(struct node));
 tmp->coeff=q_start->coeff;
 tmp->exp=q_start->exp;
 if (r_start==NULL)
 {
 r_start=tmp;
 p=tmp;
 }
 else
 {
 p->next=tmp;
 p=tmp;
 }
 q_start=q_start->next;
 }
          }

 else
  {
 while(p_start!=NULL && q_start!=NULL )
 {
 tmp=(struct node*)malloc(sizeof(struct node));
 if(r_start==NULL)
 {
 r_start=tmp;
 p=tmp;
 }
 else
 {
 p->next=tmp;
 p=tmp;
 }
 
               
                  if(p_start->exp > q_start->exp)
 {
 tmp->coeff=p_start->coeff;
 tmp->exp=p_start->exp;
 p_start=p_start->next;
 }
 else if(q_start->exp > p_start->exp)
 {
 tmp->coeff=q_start->coeff;
 tmp->exp=q_start->exp;
 q_start=q_start->next;
 }
 else if(p_start->exp == q_start->exp)
 {
 tmp->coeff=p_start->coeff + q_start->coeff;
 tmp->exp=p_start->exp;
 p_start=p_start->next;
 q_start=q_start->next;
 }
 }

  }

p->next=NULL;
return r_start;
}

void display(struct node *ptr)
{
if(ptr==NULL)
{
printf("Empty\n");
}
while(ptr!=NULL)
{
printf("(%dx^%d) + ", ptr->coeff,ptr->exp);
ptr=ptr->next;
}
printf("\b\b \n");
}
