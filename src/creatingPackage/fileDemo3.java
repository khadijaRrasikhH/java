package creatingPackage;

import java.io.*;
import java.util.Scanner;

public class fileDemo3 {
        public static void main(String[] args) throws IOException {
            FileOutputStream fos=new FileOutputStream("");
            DataOutputStream  dop=new DataOutputStream(fos);
       dop.writeUTF("Demo content");

                }}
