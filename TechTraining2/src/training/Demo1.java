package training;

public class Demo1 {

    public static void main(String[] args) {
        String number = "2080-02-29";
        String[] parts = number.split("-"); // Split the input by hyphen
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            StringBuilder binaryPart = new StringBuilder();

            // Convert each character in the part to binary
            for (char ch1 : part.toCharArray()) {
                int num = ch1 - '0'; // Convert char to int
                StringBuilder sb = new StringBuilder();
                while (num > 0) {
                    int rem = num % 2;
                    sb.append(rem);
                    num = num / 2;
                }
                if (sb.length() == 0) {
                    sb.append('0'); // Handle the case for '0'
                }

                // Reverse the binary string and append it to binaryPart
                binaryPart.append(sb.reverse());
            }

            // Append the binary representation of the part to sb1
            sb1.append(binaryPart);

            // Append a hyphen if it's not the last part
            if (i < parts.length - 1) {
                sb1.append('-');
            }
        }

        System.out.println(sb1.toString());
    }
}