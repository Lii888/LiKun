#include <iostream>
using namespace std;

typedef int ElemType;

typedef struct StackNode
{
    ElemType data;
    struct StackNode *next;
}StackNode, *LinkStack;

int InitStack(LinkStack &s)
{
    s=NULL;
    return 0;
}

int Push(LinkStack &s,ElemType e)
{
    StackNode *p;
    p = new StackNode;
    p->data = e;
    p->next = s;
    s=p;
    return 0;
}

int Pop(LinkStack &s,ElemType &e)
{
    StackNode *p;
    if(s==NULL)
        return -1;
    e=s->data;
    p = s;
    s=s->next;
    delete p;
    return 0;
}

int main()
{
    StackNode *s = new StackNode;
    int element;
    InitStack(s);
    for(int i=0;i<5;i++)
        Push(s,i);
    for(int i=0;i<5;i++) {
        Pop(s, element);
        cout << element << endl;
    }
}
