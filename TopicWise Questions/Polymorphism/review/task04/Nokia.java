package task04;

public class Nokia extends Mobile {
    private double balance;

    public Nokia(String model, boolean simCardStatus, String IMEICode, double balance) {
        super(model, IMEICode, simCardStatus);
        this.balance = balance;
    }


    public String toString() {
        return super.toString() + "\nBalance: " + balance + " TK";
    }

    public String dialCall(String number) {
        String code = "";// First 3 digits

        for (int i = 0; i < number.length(); i++) {
            code += number.charAt(i);
        }
        String country = getCountryName(code);

        if (country == null) {
            return "Dialing is not allowed in this region.";
        }

        if (!simCardStatus) {
            return "No SIM card available! Please check the SIM card connectivity.";
        }

        if (balance < 1) {
            return "Insufficient balance! Please recharge.";
        }

        return "Dialing the number " + number + " to " + country + " region.";
    }

    public void rechargeSIMCard(double amount) {
        balance += amount;
        System.out.println("Recharge successful! Current balance " + balance + " TK.");
    }
}
