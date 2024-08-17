#include <bits/stdc++.h>
using namespace std;
#define ll  long long
#define lll __int128
#define sz(s) s.size()
#define  vv vector<ll>
#define all(x) x.begin(),x.end()
#define rall(x) x.rbegin(),x.rend()
#define HOn ios_base::sync_with_stdio(0), cin.tie(nullptr), cout.tie(nullptr);
//vector<string>vec{"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
const ll mod=1e9+7;
bool knowbit(ll num,ll ind){
    return (num>>ind)&1; //-->val of ind bit
}
int main() {
    HOn
    ll TCs=1;
    cin>>TCs;
    while (TCs--){
      string s; cin>>s;
      int x=0,y=0;
        for (int i = 1; i < s.length(); ++i) {
            if (s[x]!=s[i])
            {
                swap(s[0],s[i]);
                //cout<<x<<" ";
                y=1;
                break;
            }
        }
        if (y)
            cout<<"YES\n"<<s<<"\n";
            else
                cout<<"NO\n";

    }
}