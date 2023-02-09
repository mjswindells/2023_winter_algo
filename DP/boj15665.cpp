#include <iostream>
#include <vector>
#include <algorithm>
#include <set>
using namespace std;
vector<int> ans={-1};
//bool check[8];
void printNM(set<int> mset,int m,int count){
    if(count==m) {
        for(int i=1;i<=m;i++){
            cout<<ans[i]<<" ";
        }
        cout<<"\n";
        return;
    }
    for(int i:mset){
        if(ans.back()<=i){
            ans.push_back(i);
            printNM(mset,m,count+1);
            ans.pop_back();
        }
    }
}

int main(){
    //입출력시간 감소
    cin.tie(NULL); ios_base::sync_with_stdio(0);
    
    int n,m,k;cin>>n>>m;
    set<int> mset;

    for(int i=0;i<n;i++) {
        cin>>k;
        mset.insert(k);
    }
    
    printNM(mset,m,0);
    
}