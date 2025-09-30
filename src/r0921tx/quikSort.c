#include <stdio.h>

void quick_sort(int *a,int left,int right);

int main(){
    int a[] = {9,45,12,6,7,31};
    int n;
    int i;

    n = sizeof(a) / sizeof(int);
    quick_sort(a,0,n - 1);
    for(i = 0;i < n;i++){

    printf("%d ",a[i]);

    }
    puts("");
    return 0;
}

    void quick_sort(int *a,int left,int right){
        int x;
        if(left < right){
            x = partition(a,left,right);
            quick_sort(a,left,x - 1);
            quick_sort(a,x + 1,right);
        }
    }

    int partition(int *a,int left,int right){
        int x = a[left];

        while(left < right){
            while(left < right && a[right] >= x){
                rigth--;
            }
            a[left] = a[right];
            while(left < right && a[left] <= x){
                left++;
            }
            a[right] = a[left];
        }
        a[left] = x;
        return left;
    }