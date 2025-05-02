class PrimeNumber{
    public static void main(String args[]){
int num;
boolean flag = false;
if(args.length == 0){
    System.out.println("Please provide a command line argument.");
    return;
}
num = Integer.parseInt(args[0]);

if(num == 0 || num == 1){
    flag = true;
}

for(int i = 2; i <= num / 2; i++){

    if(num % i == 0){
      flag = true;
      break;
    }
}
    if(!flag){
      System.out.println(num + " is a prime number.");
    }
    else{
        System.out.println(num + " is not a prime number.");
    }
}
}
