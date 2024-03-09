class Solution {
    public String simplifyPath(String path) {
        Stack<String> stc= new Stack<>();
        String[] comps = path.split("/");       //first element is (empty string)

        for(String comp : comps){       
            if(comp.equals("..")){
                if(!stc.isEmpty()){
                    stc.pop();
                }
            }
            else if (!comp.isEmpty() && !comp.equals(".")){
                stc.push(comp);
            }
        }

        StringBuilder result = new StringBuilder();

        for(String dir : stc){
            result.append("/").append(dir);
        }

        if(result.length() > 0){
            return result.toString();
        }else{
            return "/";
        }
    }
}
