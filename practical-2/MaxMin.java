import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking four numbers from user
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        System.out.print("Enter fourth number: ");
        int d = input.nextInt();

        // Finding maximum using nested if-else
        int max;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }

        // Finding minimum using nested if-else
        int min;
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    min = a;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    min = b;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        }

        // Output results
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}





// using command line
public class MaxMin {
    public static void main(String[] args) {
        // Check if 4 arguments are given
        if (args.length != 4) {
            System.out.println("Please enter exactly 4 numbers as command line arguments.");
            return;
        }

        // Convert arguments from String to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        // Find maximum
        int max;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }

        // Finding minimum using nested if-else
        int min;
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    min = a;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    min = b;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
