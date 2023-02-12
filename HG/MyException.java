class MyException extends Exception{
 String str1;
 MyException(String str2) {
 str1=str2;
 }
 public String toString(){ 
 return ("Output String = "+str1) ;
 }
}
class CustomException{
 public static void main(String args[]){
 try{
 throw new MyException("Custom");
 // I'm throwing user defined custom exception above
 }
 catch(MyException exp){
 System.out.println("Hi this is my catch block") ;
 System.out.println(exp) ;
 }
 }