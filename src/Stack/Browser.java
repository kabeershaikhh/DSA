package Stack;
// it is implemented with concept of ARRAY STACK
import java.util.Arrays;

public class Browser {
    private String[] backwardStack;
    private String[] forwardStack;
    private int backwardTop;
    private int forwardTop;

    public Browser() {
        backwardStack = new String[10];
        forwardStack = new String[10];
        backwardTop = -1;
        forwardTop = -1;
    }
    public void navigate(String url) {
        pushToBackward(url);
        forwardTop = -1; 
        System.out.println("Navigating to: " + url);
    }
    public void back() {
        if (backwardTop == -1) {
            System.out.println("Cannot go back. No history.");
            return;
        }
        String current = backwardStack[backwardTop--];
        pushToForward(current);
        System.out.println("Going back from: " + current);
    }

    public void forward() {
        if (forwardTop == -1) {
            System.out.println("Cannot go forward. No history.");
            return;
        }
        String current = forwardStack[forwardTop--];
        pushToBackward(current);
        System.out.println("Going forward to: " + current);
    }

    private void pushToBackward(String url) {
        if (backwardTop == backwardStack.length - 1) {
            backwardStack = Arrays.copyOf(backwardStack, backwardStack.length * 2);
        }
        backwardStack[++backwardTop] = url;
    }

    private void pushToForward(String url) {
        if (forwardTop == forwardStack.length - 1) {
            forwardStack = Arrays.copyOf(forwardStack, forwardStack.length * 2);
        }
        forwardStack[++forwardTop] = url;
    }

    public static void main(String[] args) {
        Browser browser = new Browser();

        browser.navigate("www.example.com/page1");
        browser.navigate("www.example.com/page2");
        browser.navigate("www.example.com/page3");

        browser.back(); 
        browser.back(); 

        browser.forward(); 
        browser.forward();
    }
}


