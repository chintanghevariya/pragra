package TimHorntonsUpdated;

import Exercise.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int orderCounter = 0;
        int choice = 0;
        double totalPrice = 0;
        boolean controller = true;
        Scanner sc = new Scanner(System.in);
        CoffeePowder cf = new CoffeePowder();
        Mug m = new Mug();
        HockeyCard hc = new HockeyCard();
        GiftCard gc = new GiftCard();
        Map<Mercendise, Integer> orders = new HashMap<>();

        while (controller) {
            System.out.println("1. Coffee Powder");
            System.out.println("2. Mug");
            System.out.println("3. Hockey Card");
            System.out.println("4. Gift Card");
            System.out.println("5. Checkout");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Coffee Powder");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Coffee Price is : " + cf.getPrice());
                            System.out.println("Feature is : " + cf.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                int quantity = 0;
                              //  tim[orderCounter++] = mug;
                                switch (choice){
                                    case 1:
                                        System.out.println("Enter the quantity : ");
                                        int temp = sc.nextInt();
                                        if(orders.containsKey(cf)){
                                            for(Map.Entry<Mercendise,Integer> entry : orders.entrySet()){
                                                quantity = entry.getValue();
                                            }
                                            quantity += temp;
                                            double tempPrice = cf.getPrice();
                                            totalPrice += tempPrice * temp;
                                            orders.put(cf,quantity);
                                        }else {
                                            quantity = temp;
                                            orders.put(cf, temp);
                                            totalPrice += cf.getPrice() * temp;
                                        }
                                }
                            }
                        break;
                    }
                    break;
                case 2:
                    System.out.println("2. Mug");
                    switch (choice) {
                        case 1:
                            System.out.println("Mug Price is : " + m.getPrice());
                            System.out.println("Feature is : " + m.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                int quantity = 0;
                                switch (choice){
                                    case 1:
                                        System.out.println("Enter the quantity : ");
                                        int temp = sc.nextInt();
                                        if(orders.containsKey(m)){
                                            for(Map.Entry<Mercendise,Integer> entry : orders.entrySet()){
                                                quantity = entry.getValue();
                                            }
                                            quantity += temp;
                                            double tempPrice = m.getPrice();
                                            totalPrice += tempPrice * temp;
                                            orders.put(m,quantity);
                                        }else {
                                            quantity = temp;
                                            orders.put(m, temp);
                                            totalPrice += m.getPrice() * temp;
                                        }
                                }
                            }
                            break;
                    }
                case 3:
                    System.out.println("3. Hockey card");
                    switch (choice) {
                        case 1:
                            System.out.println("hockey card Price is : " + hc.getPrice());
                            System.out.println("Feature is : " + hc.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                int quantity = 0;
                                switch (choice){
                                    case 1:
                                        System.out.println("Enter the quantity : ");
                                        int temp = sc.nextInt();
                                        if(orders.containsKey(hc)){
                                            for(Map.Entry<Mercendise,Integer> entry : orders.entrySet()){
                                                quantity = entry.getValue();
                                            }
                                            quantity += temp;
                                            double tempPrice = hc.getPrice();
                                            totalPrice += tempPrice * temp;
                                            orders.put(hc,quantity);
                                        }else {
                                            quantity = temp;
                                            orders.put(hc, temp);
                                            totalPrice += hc.getPrice() * temp;
                                        }
                                }
                            }
                            break;
                    }
                case 4:
                    System.out.println("4. Gift card");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Gift card Price is : " + gc.getPrice());
                            System.out.println("Feature is : " + gc.getFeatures());
                            System.out.println("1. Order");
                            System.out.println("2. Continue with another products");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                int quantity = 0;
                                switch (choice){
                                    case 1:
                                        System.out.println("Enter the quantity : ");
                                        int temp = sc.nextInt();
                                        if(orders.containsKey(gc)){
                                            for(Map.Entry<Mercendise,Integer> entry : orders.entrySet()){
                                                quantity = entry.getValue();
                                            }
                                            quantity += temp;
                                            double tempPrice = gc.getPrice();
                                            totalPrice += tempPrice * temp;
                                            orders.put(gc,quantity);
                                        }else {
                                            quantity = temp;
                                            orders.put(gc, temp);
                                            totalPrice += gc.getPrice() * temp;
                                        }
                                }
                            }
                            break;
                    }

                case 5:
                    System.out.println("Done with ordering");
                    System.out.println("Total Price : " + totalPrice);
                   for(Map.Entry<Mercendise,Integer> entry : orders.entrySet()){
                       System.out.println("Number of item : " + entry.getValue());
                       System.out.println(entry.getKey());
                       if(entry instanceof CoffeePowder) cf.getStoreAddress();
                       if(entry instanceof Mug) m.getStoreAddress();
                       if(entry instanceof HockeyCard) hc.getStoreAddress();
                       if(entry instanceof HockeyCard) hc.getStoreAddress();

                   }
                   controller = false;
                   break;
            }
        }
    }
}