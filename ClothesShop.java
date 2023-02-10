import java.util.Scanner;

class Shirt {
    String type;
    String size;
    int price;
    int amount;
    int j;

    Shirt(String s, int a) {
        type = "Shirt";
        size = s;
        price = 150;
        amount = a;
    }

    void addStock(int i) {
        amount += i;
    }

    int delStock(int i) {
        if (amount != 0) {
            if (i <= amount) {
                amount -= i;
                return 1;
            } else
                System.out.println("Insufficient Stock");
            return 0;
        } else
            System.out.println("Product Is Out of Stock");
        return 0;
    }
}

class T_Shirt extends Shirt {

    T_Shirt(String s, int a) {
        super(s, a);
        type = "T_Shirt";
        price = 100;
    }

}

class Customer {
    String customerId;
    int ShirtCustomer_XL;
    int ShirtCustomer_L;
    int ShirtCustomer_M;
    int ShirtCustomer_S;
    int T_ShirtCustomer_XL;
    int T_ShirtCustomer_L;
    int T_ShirtCustomer_M;
    int T_ShirtCustomer_S;
    int SumPrice = 0;

    static int income;
    public static int i = 0;

    Customer(String id) {
        customerId = id;
        ShirtCustomer_XL = 0;
        ShirtCustomer_L = 0;
        ShirtCustomer_M = 0;
        ShirtCustomer_S = 0;
        T_ShirtCustomer_XL = 0;
        T_ShirtCustomer_L = 0;
        T_ShirtCustomer_M = 0;
        T_ShirtCustomer_S = 0;
    }

    void totalBuy(Shirt S1, Shirt S2, Shirt S3, Shirt S4, Shirt S5, Shirt S6, Shirt S7, Shirt S8) {
        int j = 1, t, s, a, c = 1;

        Scanner Customer_Type = new Scanner(System.in);
        Scanner Customer_Size = new Scanner(System.in);
        Scanner Customer_Amount = new Scanner(System.in);
        Scanner Check = new Scanner(System.in);

        i++;
        System.out.println("Customer " + i + " Queue");

        while (c == 1) {

            System.out.print("Type(1 = Shirt : 2 = T-Shirt) : ");
            t = Customer_Type.nextInt();
            System.out.print("Size (1=XL : 2=L : 3=M : 4=S) : ");
            s = Customer_Size.nextInt();
            System.out.print("Amount : ");
            a = Customer_Amount.nextInt();

            if (t == 1) {
                if (s == 1) {
                    j = S1.delStock(a);
                }
                if (s == 2) {
                    j = S2.delStock(a);
                }
                if (s == 3) {
                    j = S3.delStock(a);
                }
                if (s == 4) {
                    j = S4.delStock(a);
                }
                if (j == 1) {
                    if (t == 1) {
                        SumPrice += a * 150;
                        income += a * 150;
                        if (s == 1) {
                            ShirtCustomer_XL += a;
                        }
                        if (s == 2) {
                            ShirtCustomer_L += a;
                        }
                        if (s == 3) {
                            ShirtCustomer_M += a;
                        }
                        if (s == 4) {
                            ShirtCustomer_S += a;
                        }
                    } else if (t == 2) {
                        SumPrice += a * 100;
                        income += a * 100;
                        if (s == 1) {
                            T_ShirtCustomer_XL += a;
                        }
                        if (s == 2) {
                            T_ShirtCustomer_L += a;
                        }
                        if (s == 3) {
                            T_ShirtCustomer_M += a;
                        }
                        if (s == 4) {
                            T_ShirtCustomer_S += a;
                        }
                    }
                }
            }

            if (t == 2) {
                if (s == 1) {
                    j = S5.delStock(a);
                }
                if (s == 2) {
                    j = S6.delStock(a);
                }
                if (s == 3) {
                    j = S7.delStock(a);
                }
                if (s == 4) {
                    j = S8.delStock(a);
                }
                if (j == 1) {
                    if (t == 1) {
                        SumPrice += a * 150;
                        income += a * 150;
                        if (s == 1) {
                            ShirtCustomer_XL += a;
                        }
                        if (s == 2) {
                            ShirtCustomer_L += a;
                        }
                        if (s == 3) {
                            ShirtCustomer_M += a;
                        }
                        if (s == 4) {
                            ShirtCustomer_S += a;
                        }
                    } else if (t == 2) {
                        SumPrice += a * 100;
                        income += a * 100;
                        if (s == 1) {
                            T_ShirtCustomer_XL += a;
                        }
                        if (s == 2) {
                            T_ShirtCustomer_L += a;
                        }
                        if (s == 3) {
                            T_ShirtCustomer_M += a;
                        }
                        if (s == 4) {
                            T_ShirtCustomer_S += a;
                        }
                    }
                }
            }

            System.out.print("Done Shopping? (0 = Done : 1 = Not yet): ");
            c = Check.nextInt();
        }
    }

    void Data() {
        System.out.println("Customer Number : " + customerId);
        System.out.println("Shirt Size XL : " + ShirtCustomer_XL);
        System.out.println("Shirt Size L : " + ShirtCustomer_L);
        System.out.println("Shirt Size M : " + ShirtCustomer_M);
        System.out.println("Shirt Size S : " + ShirtCustomer_S);
        System.out.println("T-Shirt Size XL : " + T_ShirtCustomer_XL);
        System.out.println("T-Shirt Size L : " + T_ShirtCustomer_L);
        System.out.println("T-Shirt Size M : " + T_ShirtCustomer_M);
        System.out.println("T-Shirt Size S : " + T_ShirtCustomer_S);
        System.out.println("Total price : " + SumPrice);
        System.out.println("");

    }

    static void showIncome() {
        System.out.println("Income : " + income);
    }

}

public class ClothesShop {
    public static void main(String[] args) {

        Customer customer01 = new Customer("01");
        Customer customer02 = new Customer("02");
        Shirt Shirt_XL = new Shirt("XL", 10);
        Shirt Shirt_L = new Shirt("L", 10);
        Shirt Shirt_M = new Shirt("M", 10);
        Shirt Shirt_S = new Shirt("S", 10);
        T_Shirt T_Shirt_XL = new T_Shirt("XL", 15);
        T_Shirt T_Shirt_L = new T_Shirt("L", 15);
        T_Shirt T_Shirt_M = new T_Shirt("M", 15);
        T_Shirt T_Shirt_S = new T_Shirt("S", 15);

        customer01.totalBuy(Shirt_XL, Shirt_L, Shirt_M, Shirt_S, T_Shirt_XL, T_Shirt_L, T_Shirt_M, T_Shirt_S);
        customer02.totalBuy(Shirt_XL, Shirt_L, Shirt_M, Shirt_S, T_Shirt_XL, T_Shirt_L, T_Shirt_M, T_Shirt_S);

        customer01.Data();
        customer02.Data();

        Customer.showIncome();

        System.out.println("Makontawat junpum 1630902789");

    }
}
