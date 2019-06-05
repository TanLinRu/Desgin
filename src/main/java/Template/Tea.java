/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-05 08:58
 **/
package Template;

import java.beans.Customizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public boolean customerWantCondiments() {
        System.out.println("Would you like lemon with your tea(y/n)?");
        String userInput = getUserInput() ;
        if ( userInput.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserInput() {
        String userInput = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            userInput = bufferedReader.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        if ( userInput != null ) {
            return userInput;
        }else {
            return "no";
        }
    }
}