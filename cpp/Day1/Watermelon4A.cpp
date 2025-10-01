#include <iostream>
using namespace std;

int main() {
    // Problem: https://codeforces.com/problemset/problem/4/A
    int n;
    cin >> n;
    if (n % 2 == 0 && n > 2) cout << "YES" << endl;
    else cout << "NO" << endl;
    return 0;
}
