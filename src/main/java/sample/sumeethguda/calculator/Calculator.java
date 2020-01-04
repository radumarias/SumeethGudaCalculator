package sample.sumeethguda.calculator;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static String hexadecimal(String n) {
        int n1 = Integer.parseInt(n);
        return Integer.toHexString(n1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            int counter = 1;
            while (n != 0) {
                counter *= n;
                n--;
            }
            return counter;
        }
    }

    public static int exponential(int n, int m) {
        if (n == 0) {
            return 0;
        } else if (m == 0) {
            return 1;
        } else {
            int counter = 1;
            for (int i = 0; i < m; i++) {
                counter *= n;
            }
            return counter;
        }
    }

    public static String binary(int x) {
        return Integer.toBinaryString(x);
    }

    public static double euler(double x) {
        if (x == 0) {
            return 1;
        } else {
            return Math.pow(Math.E, x);
        }
    }

    public static int combination(int a, int b) {
        int numerator = factorial(a);
        int denominator = factorial(a - b) * factorial(b);
        return numerator / denominator;
    }

    public static int permutations(int c, int d) {
        int numerator1 = factorial(c);
        int denominatot1 = factorial(c - d);
        return numerator1 / denominatot1;
    }

    public static double cos(double a) {
        return Math.cos(a);

    }

    public static double sin(double b) {
        return Math.sin(b);
    }

    public static double tan(double c) {
        return Math.tan(c);
    }

    public static double sec(double d) {
        return 1 / cos(d);
    }

    public static double csc(double e) {
        return 1 / sin(e);
    }

    public static double cot(double f) {
        return 1 / tan(f);
    }

    public static double cosh(double g) {
        return (euler(g) + euler(g * -1)) / 2;
    }

    public static double sinh(double h) {
        return (euler(h) - euler(h * -1)) / 2;
    }

    public static double tanh(double i) {
        return sinh(i) / cosh(i);
    }

    public static double coth(double j) {
        return cosh(j) / sinh(j);
    }

    public static double sech(double k) {
        return 1 / cosh(k);
    }

    public static double csch(double l) {
        return 1 / sinh(l);
    }


    public static void main(String[] args) {
        String[] option = {"fibonacci", "hexadecimal", "factorial", "exponential", "binary", "euler",
                "combinations", "permutations", "trigonometric"};
        boolean flagp = true;
        while (flagp) {
            String start = JOptionPane.showInputDialog(null, "Choose operation", option[0],
                    JOptionPane.QUESTION_MESSAGE);
//fibonacci
            if (start.equals(option[0])) {
                boolean flag = true;
                while (flag) {
                    String o = JOptionPane.showInputDialog(null, "Enter a number", "fib",
                            JOptionPane.QUESTION_MESSAGE);
                    int s = Integer.parseInt(o);
                    int fin = fibonacci(s);
                    int out = JOptionPane.showConfirmDialog(null, "The fibonacci term is: " + fin,
                            "fib",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
                    if (out == 0) {
                        int cont = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "continue",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using fibonacci",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing fibonacci",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag = false;
                    }
                }
//hexadecimal
            } else if (start.equals(option[1])) {
                boolean flag1 = true;
                while (flag1) {
                    String h = JOptionPane.showInputDialog(null, "Enter a number", "hex",
                            JOptionPane.QUESTION_MESSAGE);
                    String hex = hexadecimal(h);
                    int out1 = JOptionPane.showConfirmDialog(null, "The hexadecimal term is: "
                                    + hex, "hexadecimal", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out1 == 0) {
                        int cont1 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "hexadecimal",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont1 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using hexadecimal",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag1 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing hexadecimal",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag1 = false;
                    }
                }
//factorial
            } else if (start.equals(option[2])) {
                boolean flag2 = true;
                while (flag2) {
                    String g = JOptionPane.showInputDialog(null, "Enter a number", "factorial",
                            JOptionPane.QUESTION_MESSAGE);
                    int string = Integer.parseInt(g);
                    int fact = factorial(string);
                    int out2 = JOptionPane.showConfirmDialog(null, "The factorial term is: "
                                    + fact, "factorial", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out2 == 0) {
                        int cont2 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "factorial",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont2 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using factorial",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag2 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing factorial",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag2 = false;
                    }
                }
//exponential
            } else if (start.equals(option[3])) {
                System.out.println(exponential(3, 4));
                boolean flag3 = true;
                while (flag3) {
                    String h = JOptionPane.showInputDialog(null, "Enter number base", "exponential",
                            JOptionPane.QUESTION_MESSAGE);
                    String i = JOptionPane.showInputDialog(null, "Enter number exponent", "exponential",
                            JOptionPane.QUESTION_MESSAGE);
                    int base = Integer.parseInt(h);
                    int exp = Integer.parseInt(i);
                    int val = exponential(base, exp);
                    String sent = base + "^" + exp + " = " + val;
                    int out3 = JOptionPane.showConfirmDialog(null, sent, "exponential",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out3 == 0) {
                        int cont3 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "exponential",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont3 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using exponential",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag3 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing exponential",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag3 = false;
                    }

                }
//binary
            } else if (start.equals(option[4])) {
                boolean flag4 = true;
                while (flag4) {
                    String j = JOptionPane.showInputDialog(null, "Enter a number", "binary",
                            JOptionPane.QUESTION_MESSAGE);
                    int k = Integer.parseInt(j);
                    String bin = binary(k);
                    int out4 = JOptionPane.showConfirmDialog(null, "The binary term is: "
                                    + bin, "binary", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out4 == 0) {
                        int cont4 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "binary",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont4 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using binary",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag4 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing binary",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag4 = false;
                    }
                }
//euler
            } else if (start.equals(option[5])) {
                boolean flag5 = true;
                while (flag5) {
                    String p = JOptionPane.showInputDialog(null, "Enter power:", "euler",
                            JOptionPane.QUESTION_MESSAGE);
                    double exp1 = Double.parseDouble(p);
                    double eval = euler(exp1);
                    String sent1 = "e^" + exp1 + " = " + eval;
                    int out5 = JOptionPane.showConfirmDialog(null, sent1, "euler",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out5 == 0) {
                        int cont5 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "euler",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont5 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using euler",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag5 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing euler",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag5 = false;
                    }

                }
//combinations
            } else if (start.equals(option[6])) {
                boolean flag6 = true;
                while (flag6) {
                    String q = JOptionPane.showInputDialog(null, "Enter n objects:", "combinations",
                            JOptionPane.QUESTION_MESSAGE);
                    String r = JOptionPane.showInputDialog(null, "Enter r sample size:",
                            "combinations", JOptionPane.QUESTION_MESSAGE);
                    int objects = Integer.parseInt(q);
                    int sample = Integer.parseInt(r);
                    int combinations = combination(objects, sample);
                    String sent2 = objects + "C" + sample + " = " + combinations;
                    int out6 = JOptionPane.showConfirmDialog(null, sent2, "combinations",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out6 == 0) {
                        int cont6 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "combinations",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont6 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using combinations",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag6 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing combinations",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag6 = false;
                    }
                }
//permutations
            } else if (start.equals(option[7])) {
                boolean flag7 = true;
                while (flag7) {
                    String s = JOptionPane.showInputDialog(null, "Enter n objects:", "permutations",
                            JOptionPane.QUESTION_MESSAGE);
                    String t = JOptionPane.showInputDialog(null, "Enter r sample size:",
                            "permutations", JOptionPane.QUESTION_MESSAGE);
                    int objects1 = Integer.parseInt(s);
                    int sample1 = Integer.parseInt(t);
                    int permutations = combination(objects1, sample1);
                    String sent3 = objects1 + "P" + sample1 + " = " + permutations;
                    int out7 = JOptionPane.showConfirmDialog(null, sent3, "permutations",
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null);
                    if (out7 == 0) {
                        int cont7 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                "permutations",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                        if (cont7 == 1) {
                            JOptionPane.showMessageDialog(null, "Thank you for using permutations",
                                    "Thank you", JOptionPane.INFORMATION_MESSAGE);
                            flag7 = false;
                        } else {
                            continue;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Thank you for choosing permutations",
                                "Thank you", JOptionPane.INFORMATION_MESSAGE);
                        flag7 = false;
                    }
                }
//trigonometric
            } else if (start.equals(option[8])) {
                 boolean flag8 = true;
                 while (flag8) {
                     String t = JOptionPane.showInputDialog(null,
                             "Hyperbolic or Standard?","trigonometric", JOptionPane.QUESTION_MESSAGE);
                     if (t.equals("Hyperbolic")) {
                         String u = JOptionPane.showInputDialog(null, "Enter a number",
                                 "Hyperbolic trig", JOptionPane.QUESTION_MESSAGE);
                             double x = Double.parseDouble(u);
                             String uu = JOptionPane.showInputDialog(null,
                                     "Which hyperbolic trig function do you want? (sinh)", "Hyperbolic",
                                     JOptionPane.QUESTION_MESSAGE);
                             double s = 0.0;
                             switch(uu){
                                 case "sinh":
                                     s += sinh(x);
                                     break;
                                 case "cosh":
                                     s += cosh(x);
                                     break;
                                 case "tanh":
                                     s += tanh(x);
                                     break;
                                 case "sech":
                                     s += sech(x);
                                     break;
                                 case "csch":
                                     s += csch(x);
                                     break;
                                 case "coth":
                                     s += coth(x);
                                     break;
                                 default:
                                     continue;
                             }
                             String sent4 = uu + "(" + x + ")" + " = " + s;
                         int out8 = JOptionPane.showConfirmDialog(null, sent4, "Hyperbolic",
                                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                 null);
                         if (out8 == 0) {
                             int cont8 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                     "Hyperbolic",
                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                             if (cont8 == 1) {
                                 JOptionPane.showMessageDialog(null, "Thank you for using Hyperbolic",
                                         "Thank you", JOptionPane.INFORMATION_MESSAGE);
                                 flag8 = false;
                             } else {
                                 continue;
                             }
                         } else {
                             JOptionPane.showMessageDialog(null, "Thank you for choosing hyperbolic",
                                     "Thank you", JOptionPane.INFORMATION_MESSAGE);
                             flag8 = false;
                         }

                     } else if (t.equals("Standard")) {
                         String v = JOptionPane.showInputDialog(null, "Enter a number",
                                 "Standard trig", JOptionPane.QUESTION_MESSAGE);
                         double y = Double.parseDouble(v);
                         String uv = JOptionPane.showInputDialog(null,
                                 "Which standard trig function do you want? (sine)", "Standard",
                                 JOptionPane.QUESTION_MESSAGE);
                         double w = 0.0;
                         switch(uv){
                             case "sine":
                                 w += sin(y);
                                 break;
                             case "cosine":
                                 w += cos(y);
                                 break;
                             case "tangent":
                                 w += tan(y);
                                 break;
                             case "secant":
                                 w += sec(y);
                                 break;
                             case "cosecant":
                                 w += csc(y);
                                 break;
                             case "cotangent":
                                 w += cot(y);
                                 break;
                             default:
                                 continue;
                         }
                         String sent5 = uv + "(" + y + ")" + " = " + w;
                         int out9 = JOptionPane.showConfirmDialog(null, sent5, "Standard",
                                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                 null);
                         if (out9 == 0) {
                             int cont9 = JOptionPane.showConfirmDialog(null, "do you want to continue?",
                                     "Standard",
                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                             if (cont9 == 1) {
                                 JOptionPane.showMessageDialog(null, "Thank you for using Standard trig",
                                         "Thank you", JOptionPane.INFORMATION_MESSAGE);
                                 flag8 = false;
                             } else {
                                 continue;
                             }
                         } else {
                             JOptionPane.showMessageDialog(null, "Thank you for choosing Standard",
                                     "Thank you", JOptionPane.INFORMATION_MESSAGE);
                             flag8 = false;
                         }

                     } else {
                         flag8 = false;
                     }
                 }
            }


//continue
                int conTinue = JOptionPane.showConfirmDialog(null,
                        "Would you like to do another operation?", "operation",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                if (conTinue == 0) {
                    continue;
                } else {
                    flagp = false;
                    //return;
                }
            }
            JOptionPane.showMessageDialog(null, "Thank you for using sample.sumeethguda.Calculator.Calculator.java",
                    "Thank you", JOptionPane.INFORMATION_MESSAGE, null);
            return;
        }
    }

// send email to rmarias@redcapcloud.com    Hi Radu,  @jrao, my dad suggested I contact you.  I am learning Java.  Can you provide guidance on how to improve this program?