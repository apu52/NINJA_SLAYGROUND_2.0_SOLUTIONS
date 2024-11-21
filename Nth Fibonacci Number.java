#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n; 
    
    if (n == 1 || n == 2) {
        cout << 1 << endl; 
        return 0;
    }
    
    
    int prev1 = 1, prev2 = 1; 
    int curr = 0;
    
    for (int i = 3; i <= n; ++i) {
        curr = prev1 + prev2; 
        prev2 = prev1; 
        prev1 = curr; 
    }
    
    cout << curr << endl; 
    return 0;  
}
