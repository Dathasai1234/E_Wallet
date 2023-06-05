package Projects;

import java.util.Scanner;

public class E_Wallet_v2 {

    int password = 1234;
    int count = 3;
    int min_balance = 2000;
    int balance = 2000;

    //	static initializer
    static {
        System.out.println("Welcome to E-Wallet");
    }

    /////////////////////////////////////////////////////////////////////////////////

//password validation

    Scanner sc = new Scanner(System.in);

    public boolean login_validate() {
        System.out.println("\nPlease Enter Your Credentials.");
        int pwd = sc.nextInt();

        if (password == pwd) {
            return true;
        } else {
            return false;
        }
    }

    public void on_pass_success() {
        return;
    }

    public void on_pass_fail() {
        if (count > 0) {
            System.out.println("\npress 1 to enter correct password.");
            System.out.println("press 2 to exit");

            int exit_val = sc.nextInt();

            while (exit_val > 2 || exit_val <= 0) {
                // does not allow to enter other than 1 or 2. Repeats in loop till we enter 1 or
                // 2
                System.out.println("\nInvalid number entered.");
                System.out.println("press 1 to enter correct password.");
                System.out.println("press 2 to exit");
                exit_val = sc.nextInt(); // reinitializing again. if 1 or 2. while loop exits.
            }

            if (exit_val == 1) {
                return;
            } else if (exit_val == 2) {
                System.out.println("\nPlease visit again");
                System.out.println("Logged out");
            }
        } else {
            System.out.println("\nYou tried all 3 attempts. Please try again");
            System.out.println("Logging out");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////

//	selection templates

//	main menu

    public int main_menu() {
        System.out.println("\nPress any one");

        System.out.println("\npress 1 for Shopping");
        System.out.println("press 2 for Add money");
        System.out.println("press 3 for Check balance");
        System.out.println("press 4 for exit or log out");

        int post_login_options = sc.nextInt();

        while (post_login_options > 4 || post_login_options <= 0) {
            System.out.println("\nInvalid number entered. Enter 1, 2, or 3");
            System.out.println("press 1 for Shopping");
            System.out.println("press 2 for Add money");
            System.out.println("press 3 for Check balance");
            System.out.println("press 4 for exit or log out");
            post_login_options = sc.nextInt();
        }

        return post_login_options;
    }

    // --------------------------------------------------------------------------------------------------------------

//	shopping Items menu

    public int shopping_items() {
        System.out.println("\nShopping is Selected 🛒");

        System.out.println("\nSelect any one of a category");
        System.out.println("press 1 for Watches");
        System.out.println("press 2 for Shoes");
        System.out.println("press 3 for Hoodies");
        System.out.println("press 4 for Caps");
        System.out.println("press 5 for Bags");
        System.out.println("press 6 for Makeup kit");
        System.out.println("press 7 for Main menu");

        int select_shopping = sc.nextInt();
//		while (!make_default) {
        while (select_shopping > 7 || select_shopping <= 0) {
            System.out.println("Invalid number. Try again");

            System.out.println("\nSelect any one of a category");
            System.out.println("press 1 for Watches");
            System.out.println("press 2 for Shoes");
            System.out.println("press 3 for Hoodies");
            System.out.println("press 4 for Caps");
            System.out.println("press 5 for Bags");
            System.out.println("press 6 for Makeup kit");
            System.out.println("press 7 for Main menu");

            select_shopping = sc.nextInt();
        }
//		}

        return select_shopping;
    }

    // --------------------------------------------------------------------------------------------------------------

    //	Watches
    String a = "rolex", a_2 = "timex", a_3 = "GShock", a_4 = "Gucci", a_5 = "Fasttrack";
    int a_p = 5000, a_2_p = 2000, a_3_p = 10000, a_4_p = 15000, a_5_p = 1000;

//    shoes
    String b = "Nike", b_2 = "Adidas", b_3 = "Puma", b_4 = "Reebok", b_5 = "Converse";
    int b_p = 10000, b_2_p = 5000, b_3_p = 2000, b_4_p = 1500, b_5_p = 5500;

//    Hoodies
    String c = "Champion", c_2 = "The North Face", c_3 = "Adidas", c_4 = "Under Armour", c_5 = "Carhartt";
    int c_p = 50000, c_2_p = 15000, c_3_p = 1000, c_4_p = 1500, c_5_p = 1200;

//    Caps
    String d = "New Era", d_2 = "Flex-fit", d_3 = "Yupoong", d_4 = "Richardson", d_5 = "Mitchell & Ness";
    int d_p = 500, d_2_p = 1000, d_3_p = 1500, d_4_p = 450, d_5_p = 700;

//    Bags
    String e = "Louis Vuitton", e_2 = "Gucci", e_3 = "Prada", e_4 = "Chanel", e_5 = "Michael Kors";
    int e_p = 50000, e_2_p = 17000, e_3_p = 15500, e_4_p = 25900, e_5_p = 100000;

//    Makeup kit
    String f = "MAC", f_2 = "Sephora Collection", f_3 = "Tarte", f_4 = "NARS", f_5 = "TooFaced";
    int f_p = 1000, f_2_p = 500, f_3_p = 1050, f_4_p = 700, f_5_p = 550;

    //	watch items menu
    public int watch_menu() {
        System.out.println("\nSelected Watches ⌚");

        System.out.println("press 1 for " + a + "  - " + a_p);
        System.out.println("press 2 for " + a_2 + "  - " + a_2_p);
        System.out.println("press 3 for " + a_3 + "  - " + a_3_p);
        System.out.println("press 4 for " + a_4 + "  - " + a_4_p);
        System.out.println("press 5 for " + a_5 + "  - " + a_5_p);
        System.out.println("press 6 for accessories menu");

        int watch_options = sc.nextInt();

        while (watch_options > 6 || watch_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for rolex - 5000");
            System.out.println("press 2 for timex - 2000");
            System.out.println("press 3 for GShock - 10000");
            System.out.println("press 4 for Gucci - 15000");
            System.out.println("press 5 for FastTrack - 1000");
            System.out.println("press 6 for accessories menu");

            watch_options = sc.nextInt();
        }

        return watch_options;
    }

    // --------------------------------------------------------------------------------------------------------------

//	shoe items menu

    public int shoe_items() {
        System.out.println("\nSelected Shoes 👟");

        System.out.println("press 1 for " + b + " worth - " + b_p);
        System.out.println("press 2 for " + b_2 + "  worth - " + b_2_p);
        System.out.println("press 3 for " + b_3 + "  worth - " + b_3_p);
        System.out.println("press 4 for " + b_4 + "  worth - " + b_4_p);
        System.out.println("press 5 for " + b_5 + "  worth - " + b_5_p);
        System.out.println("press 6 for accessories Menu");

        int shoe_options = sc.nextInt();

        while (shoe_options > 6 || shoe_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for Nike worth - 10000");
            System.out.println("press 2 for Adidas worth - 5000");
            System.out.println("press 3 for Puma worth - 2000");
            System.out.println("press 4 for Reebok worth - 1500");
            System.out.println("press 5 for Converse worth - 5500");
            System.out.println("press 6 for accessories Menu");

            shoe_options = sc.nextInt();
        }
        return shoe_options;
    }

//--------------------------------------------------------------------------------------------------------------

//	Hoodie items menu

    public int hoodie_items() {
        System.out.println("\nSelected Hoodies 👕");

        System.out.println("press 1 for " + c + " worth - " + c_p);
        System.out.println("press 2 for " + c_2 + "  worth - " + c_2_p);
        System.out.println("press 3 for " + c_3 + "  worth - " + c_3_p);
        System.out.println("press 4 for " + c_4 + "  worth - " + c_4_p);
        System.out.println("press 5 for " + c_5 + "  worth - " + c_5_p);
        System.out.println("press 6 for accessories Menu");

        int hoodies_options = sc.nextInt();

        while (hoodies_options > 6 || hoodies_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for " + c + " worth - " + c_p);
            System.out.println("press 2 for " + c_2 + "  worth - " + c_2_p);
            System.out.println("press 3 for " + c_3 + "  worth - " + c_3_p);
            System.out.println("press 4 for " + c_4 + "  worth - " + c_4_p);
            System.out.println("press 5 for " + c_5 + "  worth - " + c_5_p);
            System.out.println("press 6 for accessories Menu");

            hoodies_options = sc.nextInt();
        }
        return hoodies_options;
    }

    // --------------------------------------------------------------------------------------------------------------

//	cap items menu

    public int cap_items() {
        System.out.println("\nSelected Caps 🧢");

        System.out.println("press 1 for " + d + " worth - " + d_p);
        System.out.println("press 2 for " + d_2 + "  worth - " + d_2_p);
        System.out.println("press 3 for " + d_3 + "  worth - " + d_3_p);
        System.out.println("press 4 for " + d_4 + "  worth - " + d_4_p);
        System.out.println("press 5 for " + d_5 + "  worth - " + d_5_p);
        System.out.println("press 6 for accessories Menu");

        int caps_options = sc.nextInt();

        while (caps_options > 6 || caps_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for " + d + " worth - " + d_p);
            System.out.println("press 2 for " + d_2 + "  worth - " + d_2_p);
            System.out.println("press 3 for " + d_3 + "  worth - " + d_3_p);
            System.out.println("press 4 for " + d_4 + "  worth - " + d_4_p);
            System.out.println("press 5 for " + d_5 + "  worth - " + d_5_p);
            System.out.println("press 6 for accessories Menu");

            caps_options = sc.nextInt();
        }
        return caps_options;
    }

    // --------------------------------------------------------------------------------------------------------------

//	bags items menu

    public int bag_items() {
        System.out.println("\nSelected Bags 👜");

        System.out.println("press 1 for " + e + " worth - " + e_p);
        System.out.println("press 2 for " + e_2 + "  worth - " + e_2_p);
        System.out.println("press 3 for " + e_3 + "  worth - " + e_3_p);
        System.out.println("press 4 for " + e_4 + "  worth - " + e_4_p);
        System.out.println("press 5 for " + e_5 + "  worth - " + e_5_p);
        System.out.println("press 6 for accessories Menu");

        int bags_options = sc.nextInt();

        while (bags_options > 6 || bags_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for " + e + " worth - " + e_p);
        System.out.println("press 2 for " + e_2 + "  worth - " + e_2_p);
        System.out.println("press 3 for " + e_3 + "  worth - " + e_3_p);
        System.out.println("press 4 for " + e_4 + "  worth - " + e_4_p);
        System.out.println("press 5 for " + e_5 + "  worth - " + e_5_p);
        System.out.println("press 6 for accessories Menu");

            bags_options = sc.nextInt();
        }
        return bags_options;
    }

    // --------------------------------------------------------------------------------------------------------------

//	makeup items menu

    public int makeup_items() {
        System.out.println("\nSelected Makeup kit 💄");

        System.out.println("press 1 for " + f + " worth - " + f_p);
        System.out.println("press 2 for " + f_2 + "  worth - " + f_2_p);
        System.out.println("press 3 for " + f_3 + "  worth - " + f_3_p);
        System.out.println("press 4 for " + f_4 + "  worth - " + f_4_p);
        System.out.println("press 5 for " + f_5 + "  worth - " + f_5_p);
        System.out.println("press 6 for accessories Menu");

        int makeup_options = sc.nextInt();

        while (makeup_options > 6 || makeup_options <= 0) {
            System.out.println("\nInvalid number. ");

            System.out.println("press 1 for " + f + " worth - " + f_p);
            System.out.println("press 2 for " + f_2 + "  worth - " + f_2_p);
            System.out.println("press 3 for " + f_3 + "  worth - " + f_3_p);
            System.out.println("press 4 for " + f_4 + "  worth - " + f_4_p);
            System.out.println("press 5 for " + f_5 + "  worth - " + f_5_p);
            System.out.println("press 6 for accessories Menu");

            makeup_options = sc.nextInt();
        }
        return makeup_options;
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public void buy_item(String item, int price, int id, int accessory_id) {

        if (balance > price && balance > min_balance && (balance - price > min_balance)) {
            System.out.println(item + " Selected");
            System.out.println("Do you proceed to buy the " + item + " product");

            System.out.println("press 1 to buy the product");
            System.out.println("press 2 for Shop Menu");
            int bill_options = sc.nextInt();
            while (bill_options > 2 || bill_options <= 0) {
                System.out.println("\nInvalid number selected. ");
                bill_options = sc.nextInt();
            }

            switch (bill_options) {
                case 1: {
                    System.out.println("You bought " + item + " worth " + price);
                    balance = balance - price;
                    System.out.println("your updated balance is " + balance);

                    System.out.println("\nDo you want to continue Shopping?");
                    System.out.println("Press 1 to continue shopping");
                    System.out.println("Press 2 to exit or logout");
                    int shop_2nd = sc.nextInt();

                    while (shop_2nd < 0 || shop_2nd > 2) {
                        System.out.println("\nInvalid Input");
                        System.out.println("Press 1 to continue shopping");
                        System.out.println("Press 2 to exit or logout");
                        shop_2nd = sc.nextInt();
                    }

                    switch (shop_2nd) {
                        case 1: {
                            select_shopping_item(id);
                            break;
                        }
                        case 2: {
                            exiting();
                            break;
                        }
                     }
                    break;
                }
                case 2: {
//                    shopping_menu_select(1);
                    select_shopping_item(accessory_id);
                    break;
                }
            }

        } else {
            System.out.println("You don't have sufficient balance. your " +
                    "current balance is " + balance);

            System.out.println("\nPress 1 to add money?");
            System.out.println("press 2 to return back");
            int again_shop = sc.nextInt();

            while (again_shop < 0 || again_shop > 2) {
                System.out.println("Invalid Input. Please try again");
                System.out.println("\nPress 1 to add money");
                System.out.println("\nPress 2 return back");
                again_shop = sc.nextInt();
            }

            switch (again_shop) {
                case 1: {
                    add_money();
                    select_shopping_item(accessory_id);
                    break;
                }

                case 2: {
                    select_shopping_item(accessory_id);
                    break;
                }
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////

//	Add money

    public void add_money() {

        System.out.println("\nAdd money is Selected ➕");

        System.out.println("\nminimum balance is " + min_balance);
        System.out.println("your current balance is " + balance);
        System.out.println("Enter amount to be added");

        int money_add = sc.nextInt();

        while (money_add < 1000 || money_add > 1000000) {
            System.out.println("minimum amount to be added is 1000 and maximum amount" + " is 1000000");
            money_add = sc.nextInt();
        }

        if (money_add >= 1000 && money_add <= 10000) {
            money_add = money_add - 100; // tax deduction
            balance = balance + money_add;
            System.out.println("\n" + balance + " is your updated balance.");
        } else if (money_add >= 10000 && money_add <= 100000) {
            money_add = money_add - 1000; // tax deduction
            balance = balance + money_add;
            System.out.println("\n" + balance + " is your updated balance.");
        } else if (money_add >= 100000 && money_add <= 1000000) {
            money_add = money_add - 100000; // tax deduction
            balance = balance + money_add;
            System.out.println("\n" + balance + " is your updated balance.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////

//	check balance

    public void check_balance() {
        System.out.println("\ncheck balance is Selected 💵");

        System.out.println("\nYour total amount balance is " + balance);
    }

//	exit logic

    public void exiting() {
        System.out.println("\nThank you for your service. Please visit again");
        System.out.println("Logged out");
    }

    ///////////////////////////////////////////////////////////////////////////////////

    public void select_shopping_item(int selected_item) {
        switch (selected_item) {
            case 1: {
                int selected_watch = watch_menu();
                String item = null;
                int price = 0;
                int accessory_id = 1;
                int id = 0;
                switch (selected_watch) {
                    case 1: {
                        item = a;
                        price = a_p;
                        id = 1;
                        break;
                    }
                    case 2: {
                        item = a_2;
                        price = a_2_p;
                        id = 2;
                        break;
                    }
                    case 3: {
                        item = a_3;
                        price = a_3_p;
                        id = 3;
                        break;
                    }
                    case 4: {
                        item = a_4;
                        price = a_4_p;
                        id = 4;
                        break;
                    }
                    case 5: {
                        item = a_5;
                        price = a_5_p;
                        id = 5;
                        break;
                    }
                    case 6: {
//                        shopping_start(1);
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 2: {
                int selected_shoe = shoe_items();
                String item = null;
                int price = 0;
                int accessory_id = 2;
                int id = 0;
                switch (selected_shoe) {
                    case 1: {
                        item = b;
                        id = 1;
                        price = b_p;
                        break;
                    }
                    case 2: {
                        item = b_2;
                        id = 2;
                        price = b_2_p;
                        break;
                    }
                    case 3: {
                        item = b_3;
                        id = 3;
                        price = b_3_p;
                        break;
                    }
                    case 4: {
                        item = b_4;
                        id = 4;
                        price = b_4_p;
                        break;
                    }
                    case 5: {
                        item = b_5;
                        id = 5;
                        price = b_5_p;
                        break;
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 3: {
                int selected_hoodie = hoodie_items();
                String item = null;
                int price = 0;
                int accessory_id = 3;
                int id = 0;
                switch (selected_hoodie) {
                    case 1: {
                        item = c;
                        id = 1;
                        price = c_p;
                        break;
                    }
                    case 2: {
                        item = c_2;
                        id = 2;
                        price = c_2_p;
                        break;
                    }
                    case 3: {
                        item = c_3;
                        id = 3;
                        price = c_3_p;
                        break;
                    }
                    case 4: {
                        item = c_4;
                        id = 4;
                        price = c_4_p;
                        break;
                    }
                    case 5: {
                        item = c_5;
                        id = 5;
                        price = c_5_p;
                        break;
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 4: {
                int selected_cap = cap_items();
                String item = null;
                int price = 0;
                int accessory_id = 4;
                int id = 0;
                switch (selected_cap) {
                    case 1: {
                        item = d;
                        id = 1;
                        price = d_p;
                        break;
                    }
                    case 2: {
                        item = d_2;
                        id = 2;
                        price = d_2_p;
                        break;
                    }
                    case 3: {
                        item = d_3;
                        id = 3;
                        price = d_3_p;
                        break;
                    }
                    case 4: {
                        item = d_4;
                        id = 4;
                        price = d_4_p;
                        break;
                    }
                    case 5: {
                        item = d_5;
                        id = 5;
                        price = d_5_p;
                        break;
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 5: {
                int selected_bags = bag_items();
                String item = null;
                int price = 0;
                int accessory_id = 5;
                int id = 0;
                switch (selected_bags) {
                    case 1: {
                        item = e;
                        id = 1;
                        price = e_p;
                        break;
                    }
                    case 2: {
                        item = e_2;
                        id = 2;
                        price = e_2_p;
                        break;
                    }
                    case 3: {
                        item = e_3;
                        id = 3;
                        price = e_3_p;
                        break;
                    }
                    case 4: {
                        item = e_4;
                        id = 4;
                        price = e_4_p;
                        break;
                    }
                    case 5: {
                        item = e_5;
                        id = 5;
                        price = e_5_p;
                        break;
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 6: {
                int selected_makeup = makeup_items();
                String item = null;
                int price = 0;
                int accessory_id = 6;
                int id = 0;
                switch (selected_makeup) {
                    case 1: {
                        item = f;
                        id = 1;
                        price = f_p;
                        break;
                    }
                    case 2: {
                        item = f_2;
                        id = 2;
                        price = f_2_p;
                        break;
                    }
                    case 3: {
                        item = f_3;
                        id = 3;
                        price = f_3_p;
                        break;
                    }
                    case 4: {
                        item = f_4;
                        id = 4;
                        price = f_4_p;
                        break;
                    }
                    case 5: {
                        item = f_5;
                        id = 5;
                        price = f_5_p;
                        break;
                    }
                }
                buy_item(item, price, id, accessory_id);
                break;
            }
            case 7: {
//                appstart();
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
//
//    public int appstart() {
//        int val = main_menu_select();
//        return val;
//    }
//
//    public int shopping_start(int val) {
//        int selected_shopping_item = shopping_menu_select(val);
//        return selected_shopping_item;
//    }
//
//    public void select_accessories(int selected_shopping_item) {
//        select_shopping_item(selected_shopping_item);
//    }
//
//    public int main_menu_select() {
//        return main_menu();
//    }
//
//    public int shopping_menu_select(int selected_main_menu) {
//        return on_select_shopping(selected_main_menu);
//    }
//
//    public int on_select_shopping(int selected_main_menu) {
//        return shopping_items();
//    }

    ///////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

//		object creation
        E_Wallet_v2 obj1 = new E_Wallet_v2();

//		password logic
        if (obj1.login_validate()) {
            obj1.on_pass_success();
        } else {
            obj1.count = obj1.count - 1;
            System.out.println("\nYou have " + obj1.count + " attempts left");

            obj1.on_pass_fail();
        }

//		app start
//        int val_store = obj1.appstart();
//        int val2 = obj1.shopping_start(val_store);
//        obj1.select_accessories(val2);
    }
}
