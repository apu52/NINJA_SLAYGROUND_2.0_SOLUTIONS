#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n; // Input the value of 'n'
    
    if (n == 1 || n == 2) {
        cout << 1 << endl; // First two Fibonacci numbers are 1
        return 0;
    }
    
    // Iterative approach to calculate Fibonacci numbers
    int prev1 = 1, prev2 = 1; // Initialize F(1) and F(2)
    int curr = 0;
    
    for (int i = 3; i <= n; ++i) {
        curr = prev1 + prev2; // F(n) = F(n-1) + F(n-2)
        prev2 = prev1; // Update F(n-2) to previous F(n-1)
        prev1 = curr; // Update F(n-1) to current F(n)
    }
    
    cout << curr << endl; // Output the n-th Fibonacci number
    return 0;  
}
