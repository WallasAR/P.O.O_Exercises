public class Account {
    // Atributes
    public int accouNum;
    protected String type;
    private String client;
    private float balance;
    private boolean status;

    // Methods
    public void actualState(){
        System.out.printf("\nClient: %s\n", this.getClient());
        System.out.printf("Account: %d\n", this.getAccouNum());
        System.out.printf("Type: %s\n", this.getType());
        System.out.printf("Balance: %2.2f\n", this.getBalance());
        System.out.printf("Status: %b\n", this.getStatus());
    }
    public void openAccount(String type){
        setType(type);
        setStatus(true);
        if (type.equals("CC")){
            this.setBalance(50);
            System.out.println("\nConta corrente aberta com sucesso!");
        }
        else if (type.equals("CP")){
            this.setBalance(150);
            System.out.println("\nConta poupança aberta com sucesso!");
        }
    }

    public void closeAccount(){
        if (this.getBalance() > 0) {
        System.out.printf("ERROR... Você ainda tem saldo de %.2f, saque-o antes para encerrar sua conta!\n", getBalance());
        } else if (this.getBalance() < 0) {
            System.out.println("Ocorreu um erro ao encerrar sua conta, seu saldo está negativado!");
        } else {
            this.setStatus(false);
            System.out.println("Conta finalizada com sucesso!");
        }
    }

    public void deposit(float deposit){
        if (this.getStatus()){
           this.setBalance(this.getBalance() + deposit);
           System.out.printf("Depósito realizado com sucesso na conta de %s\n", this.getClient());
        } else {
            System.out.println("Não foi possível depositar");
        }
    }

    public void booty(float booty){
        if(this.getStatus()){
            if (this.getBalance() > 0 && booty <= getBalance()){
                this.setBalance(this.getBalance() - booty);
                System.out.printf("Saque realizado na conta de %s\n", this.getClient());
            } else {
                System.out.println("Não foi possivel sacar, saldo insuficiente!");
            }
        } else {
            System.out.println("Não foi possível sacar");
        }
    }

    public void payMonthlyFee(){
        if(this.getStatus()){
            if (this.getType().equals("cc")){
                this.setBalance(getBalance() - 12);
            } else if (this.getType().equals("cp")){
                this.setBalance(getBalance() - 20);
            }
        } else {
            System.out.println("Não é possível realizar o pagamento");
        }
    }

    // Especial methods
    public Account(){
        this.setBalance(0);
        this.setStatus(false);
    }

    public int getAccouNum() {
        return accouNum;
    }
    public void setAccouNum(int accouNum){
        this.accouNum = accouNum;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getClient(){
        return client;
    }
    public void setClient(String client){
        this.client = client;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}
