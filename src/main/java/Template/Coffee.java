/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-05 09:00
 **/
package Template;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.AnnotatedElement;

public class Coffee extends CaffeineBeverageWithHook {

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantCondiments() {
        System.out.println("Would you like milk and sugar whith your coffee(y/n)?");
        String userInput = getUserIuput();
        if (userInput.toLowerCase().startsWith("y")) {
            return true;
        }else {
            return false;
        }
    }

    private String getUserIuput() {
        String userInput = null;
        BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
        try {
             userInput = stringBuffer.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        if (userInput == null) {
            return "no";
        }else {
            return userInput;
        }
    }
}