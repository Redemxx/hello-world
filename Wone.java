import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
class Main {

  public static String refresh = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
  public static String gap = "\n---------------------------------------\n";

  public static void info ()
  {
    Scanner scan = new Scanner (System.in);
    System.out.println(refresh + gap +"Wone Alpha Release 1.01.11.19\nLicense Free v.2\nCreated by Redemx A.K.A. Justin Wright\nBegan during chapter 3 of COMSCI JAVA A\nFour months ago");
    String blank = scan.nextLine();
  }

  public static String signUpone ()                                           // obtainUsername method
  {
    Scanner scan = new Scanner (System.in);
    System.out.print("Welcome to \033[0;96mWone\033[0m\n\nCreate a new account\nUsername: ");
    String a = scan.nextLine();
    return a;
  }

  public static String signUptwo ()                                           // obtainPassword method 
  {
    Scanner scan = new Scanner (System.in);
    System.out.print("\nPassword: ");
    String b = scan.nextLine();
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    return b;
  }

  public static boolean loggin (boolean check, String User, String Password)  // logginCode method
  {
    Scanner scan = new Scanner (System.in);
    check = false;

    System.out.print("Username: ");
    String name = scan.nextLine();
    System.out.print("\nPassword: ");
    String pass = scan.nextLine();

    if (name.equals(User) && pass.equals(Password))
    {
      check = true;
      System.out.println(refresh);
      return check;
    }
    if (!(name.equals(User) && pass.equals(Password)))
    {
      System.out.println("\nIncorrect username or password\n");
    }
    return false;
  }

  public static int home ()                                                   // homePage method
  {
    Scanner scan = new Scanner (System.in);
    int hold = (int)(Math.random()*25)-15;
    int in = 0;

    System.out.print("\n\n\n\n\033[0;96mWone\033[0m Home\n---------------------------------------\n 1. Hangman\n 2. Pickup Sticks\n 3. Tic-Tac-Toe\n 4. Tree generator\n 5. Math\n-1. Lock\n---------------------------------------\n");
    
    if (hold != -3)
    {
      in = scan.nextInt();
    }
    else
    in = -3;
    return in;
  }

  public static void hangMan ()                                               // hangMan method
  {
    Scanner scan = new Scanner (System.in);
    // array of hangman words
    String [] words = {"hello","present","world","burger","chiggen","probable","pancake","lumpy","scintillating","program","grandiose","truculent","competition","breakable","bleach","thunder","silent","worthless","hysterical","death","supercalifragilisticexpialidocious","borb","Porkbelly"};
    int word = (int)(Math.random()*(words.length-1));
    int wrong = (words[word].length()); // normally 6
    boolean go = true;
    int test = 0;
    int right = 0;
    int flor = 0;

    System.out.print(refresh);
    
    String [] testing = new String [words[word].length()];
    for (int i = 0; i < testing.length; i++)
    {
      testing[i] = "_" ;//words[word].charAt(i);
    }

    while (go == true)
    {
      for (int i = 0; i < testing.length; i++)
      {
        System.out.print(testing[i] + " ");
      }

      System.out.println("\nGuess a letter: ");
      String guess = scan.nextLine();

      for (int o = 0; o < testing.length; o++)
      {
        //System.out.println(words[word].substring(o,o+1));
        if (words[word].substring(o,o+1).equals(guess))
        {
          test +=1;
          right++;
          testing[o] = words[word].substring(o,o+1);
        }
      }

      if (test == 0)
      {
        wrong -= 1;
        System.out.println("\nWrong!");
      }

      for (int n = 0; n < words[word].length(); n++)
      {
      if (testing[n].charAt(0) == words[word].charAt(n))
      {
        flor++;
      }
      if (flor == words[word].length())
      {
        System.out.println();
        for (int i = 0; i < testing.length; i++)
      {
        System.out.print(testing[i] + " ");
      }

        System.out.println("\n\nYou Won!");
        go = false;
      }
      }
      flor = 0;
      test = 0;

      if (wrong == 0)
      {
      go = false;
      System.out.println("The word was " + words[word]);
      }

    }

  }

  public static void pickUpStick ()                                           // pickUpStick method
  {
    Scanner scan = new Scanner (System.in);
    System.out.println(refresh + "\n\nPicking a stick....\n");

    int length = (int)(((Math.random()*25))+2);

    for (int i = 0; i < length; i++)
    {
      System.out.print("-");
    }
    System.out.println("\nYour stick length was: " + length + "in");
  }

  public static void ticTacToe ()                                             // ticTacToe method
  {
    // ~461 lines of code
    Scanner scan = new Scanner (System.in);
    String [] roWone = {" ","|"," ","|"," "};
    String [] rowTwo = {" ","|"," ","|"," "};
    String [] rowThree = {" ","|"," ","|"," "};
    String sep = "-+-+-";
    boolean play = false;
    boolean multiPlay = false;
    int playCount = 0;

    while (!(play == true || multiPlay == true))
    {
    System.out.println(refresh + "\nTic Tac Toe\n---------------------------------------\n1. Single player\n2. Multiplayer");
    int choose = scan.nextInt();
    System.out.print(refresh);

    if (choose == 1)
    {
      play = true;
    }
    else if (choose ==2)
    {
      multiPlay = true;
    }
    }

    System.out.println();

    // single player code
      if (play == true)
      {
      System.out.println("Welcome to Tic Tac Toe! You are 'x'\n");
      while (play == true)
      {
        System.out.println();
        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(roWone[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowTwo[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowThree[i]);
        }
        System.out.println();

        boolean again = true;

        while (again == true)
        {
          System.out.println();
          System.out.print("Choose a row: ");
          int row = scan.nextInt();
          System.out.print("\nChoose a column: ");
          int column = scan.nextInt();

          if (row == 1)
          {
            if (roWone[((column-1)*2)].equals(" "))
            {
              roWone[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }

          if (row == 2)
          {
            if (rowTwo[((column-1)*2)].equals(" "))
            {
              rowTwo[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }

          if (row == 3)
          {
            if (rowThree[((column-1)*2)].equals(" "))
            {
              rowThree[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }
        }

        // Simple "Random Number" AI places an "o"
          boolean aiCheck = true;
          // simple place
          while (aiCheck == true && playCount != 9)
          {
            int atRow = (int)(Math.random()*3)+1;
            int atCol = (int)(Math.random()*3)+1;

            if (atRow == 1)
          {
            if (roWone[((atCol-1)*2)].equals(" "))
            {
              roWone[((atCol-1)*2)] = "o";
              aiCheck = false;
              playCount++;
            }
          }

          if (atRow == 2)
          {
            if (rowTwo[((atCol-1)*2)].equals(" "))
            {
              rowTwo[((atCol-1)*2)] = "o";
              aiCheck = false;
              playCount++;
            }
          }

          if (atRow == 3)
          {
            if (rowThree[((atCol-1)*2)].equals(" "))
            {
              rowThree[((atCol-1)*2)] = "o";
              aiCheck = false;
              playCount++;
            }
          }

          }
        // arrays - (x-1)*2 to find array location

        // check board
        // Horizontal
        if (roWone[0].equals(roWone[2])&&roWone[2].equals(roWone[4]) && !roWone[0].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (rowTwo[0].equals(rowTwo[2])&&rowTwo[2].equals(rowTwo[4]) && !rowTwo[0].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowTwo[0]);
        }

        else if (rowThree[0].equals(rowThree[2])&&rowThree[2].equals(rowThree[4]) && !rowThree[0].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowThree[0]);
        }
        //
        // Verticle
        else if (roWone[0].equals(rowTwo[0])&&rowTwo[0].equals(rowThree[0]) && !roWone[0].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[2].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[2]) && !roWone[2].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[2]);
        }

        else if (roWone[4].equals(rowTwo[4])&&rowTwo[4].equals(rowThree[4]) && !roWone[4].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //
        // Diagonal
        else if (roWone[0].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[4]) && !roWone[0].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[4].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[0]) && !roWone[4].equals(" "))
        {
          play = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //
        else if (playCount >= 9)
        {
          play = false;
          System.out.println("\nGame Over!\nThere is no winner");
        }



      }
      }
    //

    // multiplayer code
      if (multiPlay == true)
      {
        System.out.println("Welcome to Tic Tac Toe! Player 1 is 'x', and Player 2 is 'o'");
        while (multiPlay == true)
      {
        System.out.println();
        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(roWone[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowTwo[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowThree[i]);
        }
        System.out.println();

        boolean again = true;

        while (again == true)
        {
          System.out.println();
          System.out.print("Choose a row p1: ");
          int row = scan.nextInt();
          System.out.print("\nChoose a column p1: ");
          int column = scan.nextInt();

          if (row == 1)
          {
            if (roWone[((column-1)*2)].equals(" "))
            {
              roWone[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }

          if (row == 2)
          {
            if (rowTwo[((column-1)*2)].equals(" "))
            {
              rowTwo[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }

          if (row == 3)
          {
            if (rowThree[((column-1)*2)].equals(" "))
            {
              rowThree[((column-1)*2)] = "x";
              again = false;
              playCount++;
            }
          }
        }

        // check board
        // Horizontal
        if (roWone[0].equals(roWone[2])&&roWone[2].equals(roWone[4]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (rowTwo[0].equals(rowTwo[2])&&rowTwo[2].equals(rowTwo[4]) && !rowTwo[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowTwo[0]);
        }

        else if (rowThree[0].equals(rowThree[2])&&rowThree[2].equals(rowThree[4]) && !rowThree[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowThree[0]);
        }
        //
        // Verticle
        else if (roWone[0].equals(rowTwo[0])&&rowTwo[0].equals(rowThree[0]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[2].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[2]) && !roWone[2].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[2]);
        }

        else if (roWone[4].equals(rowTwo[4])&&rowTwo[4].equals(rowThree[4]) && !roWone[4].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //
        // Diagonal
        else if (roWone[0].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[4]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[4].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[0]) && !roWone[4].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //

        // print board
        System.out.println();
        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(roWone[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowTwo[i]);
        }
        System.out.println("\n"+sep);

        for (int i = 0; i < roWone.length; i++)
        {
          System.out.print(rowThree[i]);
        }
        System.out.println();
        //

        // p2 places an "o"
          boolean p2Check = true;
          while (p2Check == true && playCount != 9 && multiPlay == true)
          {
            System.out.println();
            System.out.print("Choose a row p2: ");
            int atRow = scan.nextInt();
            System.out.print("\nChoose a column p2: ");
            int atCol = scan.nextInt();

            if (atRow == 1)
          {
            if (roWone[((atCol-1)*2)].equals(" "))
            {
              roWone[((atCol-1)*2)] = "o";
              p2Check = false;
              playCount++;
            }
          }

          if (atRow == 2)
          {
            if (rowTwo[((atCol-1)*2)].equals(" "))
            {
              rowTwo[((atCol-1)*2)] = "o";
              p2Check = false;
              playCount++;
            }
          }

          if (atRow == 3)
          {
            if (rowThree[((atCol-1)*2)].equals(" "))
            {
              rowThree[((atCol-1)*2)] = "o";
              p2Check = false;
              playCount++;
            }
          }

          }
        // arrays - (x-1)*2 to find array location

        // check board
        // Horizontal
        if (roWone[0].equals(roWone[2])&&roWone[2].equals(roWone[4]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (rowTwo[0].equals(rowTwo[2])&&rowTwo[2].equals(rowTwo[4]) && !rowTwo[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowTwo[0]);
        }

        else if (rowThree[0].equals(rowThree[2])&&rowThree[2].equals(rowThree[4]) && !rowThree[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + rowThree[0]);
        }
        //
        // Verticle
        else if (roWone[0].equals(rowTwo[0])&&rowTwo[0].equals(rowThree[0]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[2].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[2]) && !roWone[2].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[2]);
        }

        else if (roWone[4].equals(rowTwo[4])&&rowTwo[4].equals(rowThree[4]) && !roWone[4].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //
        // Diagonal
        else if (roWone[0].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[4]) && !roWone[0].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[0]);
        }

        else if (roWone[4].equals(rowTwo[2])&&rowTwo[2].equals(rowThree[0]) && !roWone[4].equals(" "))
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThe winner is: " + roWone[4]);
        }
        //
        else if (playCount >= 9)
        {
          multiPlay = false;
          System.out.println("\nGame Over!\nThere is no winner");
        }

      }
      }

    // 

    // print board
      System.out.println();
      for (int i = 0; i < roWone.length; i++)
      {
        System.out.print(roWone[i]);
      }
      System.out.println("\n"+sep);

      for (int i = 0; i < roWone.length; i++)
      {
        System.out.print(rowTwo[i]);
      }
      System.out.println("\n"+sep);

      for (int i = 0; i < roWone.length; i++)
      {
        System.out.print(rowThree[i]);
      }
      System.out.println();

  }

  public static void treeGen ()                                               // treeGenerator
  {
    System.out.print(refresh);
    String [] layer = new String [30];
    int layerLength = 50;               // MUST BE EVEN
    int layerMiddle = layerLength/2;
    for (int i = 0; i < layer.length; i++)
    {
      layer[i] = ".";
      for (int n = 0; n < layerLength; n++)
      {
        layer[i] = layer[i]+".";
      }
    }

    double [][][] chcValue = new double [layer.length][5][3];
    // Index:
      // [][1][]: treeBoundsP_left; left, above, right
      chcValue[0][1][0] = .13;  chcValue[0][1][1] = .46;  chcValue[0][1][2] = 1.0;

      // [][2][]: treeBounds_right; right, above, left
      chcValue[0][2][0] = .13;  chcValue[0][2][1] = .46;  chcValue[0][1][2] = 1.0;

      // [][3][]: treeBounds_left_char; \, |, /
      chcValue[0][3][0] = .08; chcValue[0][3][1] = .56; chcValue[0][3][2] = 1.0;

      // [][4][]: treeBounds_right_char; /, |, \
      chcValue[0][4][0] = .08; chcValue[0][4][1] = .56; chcValue[0][4][2] = 1.0;

      // [][5][]: 
    //
    int [][] treeBounds = new int [layer.length][2];
    int [][] branchIndex = new int [layer.length][4];
    double randomNum = 0;

    for (int i = 0; i < layer.length; i++)
    {
      for (int n = 0; n < 2; n++)
      {
        if (i == 0 && n == 0)
        {
          randomNum = (int)(Math.random()*30)+2;
          treeBounds[0][0] = layerMiddle-((int)randomNum/2);
          treeBounds[0][1] = layerMiddle+((int)randomNum/2);

          // base shifting
            // left side shift
              randomNum = Math.random();
              if (randomNum < chcValue[0][1][0])
              {
                treeBounds[0][0] -= 1;
              }
              else if (randomNum >= chcValue[0][1][1])
              {
                treeBounds[0][0] += 1;
            }

            // right side shift
              randomNum = Math.random();
              if (randomNum < chcValue[0][2][0])
              {
                treeBounds[0][1] += 1;
              }
              else if (randomNum >= chcValue[0][2][1])
              {
                treeBounds[0][1] -= 1;
              }
          //

          // place base
            // left side
              randomNum = Math.random();
              if (randomNum < chcValue[0][3][0])
              {
                layer[0] = layer[0].substring(0, treeBounds[0][0]) + "/" + layer[0].substring(treeBounds[0][0], layerLength);
              }
              else if (randomNum >= chcValue[0][3][0] && randomNum < chcValue[0][3][1])
              {
                layer[0] = layer[0].substring(0, treeBounds[0][0]) + "|" + layer[0].substring(treeBounds[0][0], layerLength);
              }
              else
              {
                layer[0] = layer[0].substring(0, treeBounds[0][0]) + "/" + layer[0].substring(treeBounds[0][0], layerLength);
              }
            //

            // right side
              randomNum = Math.random();
              if (randomNum < chcValue[0][4][0])
              {
                layer[0] = layer[0].substring(0, treeBounds[0][1]) + "\\" + layer[0].substring(treeBounds[0][1], layerLength);
              }
              else if (randomNum >= chcValue[0][4][0] && randomNum < chcValue[0][4][1])
              {
                layer[0] = layer[0].substring(0, treeBounds[0][1]) + "|" + layer[0].substring(treeBounds[0][1], layerLength);
              }
              else
              {
                layer[0] = layer[0].substring(0, treeBounds[0][1]) + "\\" + layer[0].substring(treeBounds[0][1], layerLength);
              }
            //
          //

          // ground
            // left
              randomNum = (int)(Math.random()*4);
              System.out.println("Left Base: " + randomNum);
              for (int p = 0; p < randomNum; p++)
              {
                layer[0] = layer[0].substring(0, (treeBounds[0][0]-p)) + "_" + layer[0].substring((treeBounds[0][0]-p), layerLength);
              }
            //

            // right
            randomNum = (int)(Math.random()*4);
            System.out.println("Right base: " + randomNum);
            for (int p = 0; p < randomNum; p++)
              {
                layer[0] = layer[0].substring(0, (treeBounds[0][1]+p)) + "_" + layer[0].substring((treeBounds[0][1]+p), layerLength);
              }
            //
          //
        }
        else
        {

        }
      }
    }

    for (int i = layer.length-1; i >= 0; i--)
    {
      System.out.println(layer[i]);
    }

  }

  public static void operations ()                                            // number operations
  {
    Scanner scan = new Scanner (System.in);
    System.out.println(refresh + "\nOperations\n---------------------------------------\n1. Binary\n2. Octal");
    int convert = scan.nextInt();
    System.out.print(refresh);

    if (convert == 1)
    {
      System.out.print("\nConvert this number to binary: ");
      int num = scan.nextInt();
      int pow = 30;
      String binary = "";

      for (int i = pow; i >= 0; i--)
      {
        if ((num - (Math.pow(2, i))) >= 0)
        {
          num = num - (int)(Math.pow(2, i));
          binary = binary + "1";
        }
        else if (binary != "")
        {
          binary = binary + "0";
        }
      }

      System.out.println("\nBinary: " + binary);
    }

    if (convert == 2)
    {
      System.out.print("\nConvert this number to Octal: ");
      int num = scan.nextInt();
      int pow = 30;
      int hold = 0;
      boolean write = false;
      String octal = "";

      for (int i = pow; i >= 0; i--)
      {
        for (int o = 1; o < 8; o++)
        {
          if ((num - (Math.pow(8, i))) >= 0)
          {
            num = num - (int)(Math.pow(8, i));
            hold++;
            write = true;
          }
        }
        if (write == true)
        {
          octal = octal + hold;
        }
        hold = 0;
      }

      System.out.println("\nOctal: " + octal);
    }
  }

  public static void main(String str[]) throws IOException                    // callMethods main
  {

    Scanner scan = new Scanner (System.in);
    boolean run = true;
    int window = -2; 
    String User = "";
    String Password = "";

    while (run == true)                                   // execution
    {
      while (window == -3)
      {
        info();
        window=0;
      }

      while (window == -2)
      {
        User = signUpone();
        Password = signUptwo();
        window = 0;
      }

      while (window == -1)
      {
        if (loggin(false,User,Password) == true)
        {
        window = 0;
        }
        else{
        System.out.println(refresh + "\nIncorrect username or password\n");
        }
      }

      while (window == 0)
      {
        window = home();
      }

      if (window == 1)
      {
        hangMan();
        window = 0;
      }

      if (window == 2)
      {
        pickUpStick();
        window = 0;
      }

      if (window == 3)
      {
        ticTacToe();
        window = 0;
      }

      if (window == 4)
      {
        treeGen();
        window = 0;
      }

      if (window == 5)
      {
        operations();
        window = 0;
      }

      if (window > 5 || window < -3)
      {
        window = 0;
      }
    }
  }

}
