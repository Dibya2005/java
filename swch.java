 public class swch {

  public static void main(String[] args){
    int n=3;
    switch (n) {
        case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
                case 3 -> System.out.println("wednerseday");
        default -> throw new AssertionError();
    }
  }
}