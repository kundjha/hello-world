class LoginAction{

void login(String userid,String pwd){

System.out.println("Login using userid and pwd"+userid+pwd);

}

void login(String userid,long mobileno,int otp){

System.out.println("Login using userid,mobile and otp"+userid+mobileno+otp);

}

void login(String userid,String rsatoken,int pin){

System.out.println("Login using userid,rsatoken and pin"+userid+rsatoken+pin);

}

public static void main (String[] args){

LoginAction I=new LoginAction();
I.login("uid","password");
I.login("uid",99999977L,9870);
I.login("uid","rsatoken",1234);

}
}