public class searchInString {

      static boolean SearchInString(String name, char Target){
            if(name.length()==0){
                  return false;
            }
            for(int i=0; i<name.length(); i++){
                  if(Target == name.charAt(i)){
                        return true;
                  }
            }
            return false;
      }
      public static void main(String[] args) {
            String name = "Aniket";
            char Target = 'i';
            System.out.println(SearchInString(name, Target));
      }
}
