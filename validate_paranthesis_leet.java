import java.util.*;
Public Class Validate{
Public Static Boolean isvalid(String s){
Stack<Character>st=new Stack<>();
for(int i=0;i<s.length();i++){
char c=s.charAt(I);
if(c=="{" || c=="[" || c=="("){
st.push(c);
}else if(c==")"){
if(!st.isEmpty() && st.peek()=="(")
st.pop();
}
else{
return false;
}
else if(c=="}"){
if(!st.isEmpty() && st.peek()=="{")
st.pop();
}
else{
return false;
}
else if(c=="]"){
if(!st.isEmpty() && st.peek()=="[")
st.pop();
}
else{
return false;
}

return st.isEmpty();
}
}