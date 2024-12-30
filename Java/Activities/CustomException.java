
public class CustomException extends Exception  {
	String message= null;
CustomException(String s){
this.message=s;
}
@Override
public String getMessage() {
    return message;
}
	
}
