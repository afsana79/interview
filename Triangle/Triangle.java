public class Triangle {
    private Integer base;
    private Integer height;

    public Triangle(Integer base, Integer height) {
        // validate height based on customer.  Assume height must be 2 for it be triangle. 1 will be just a dot.
        if ((height <= 1) || (base <= 1)) {
            System.out.println("Provided invalid height or base.");
        }
        this.height = height;
        this.base = base;
    }

    public Triangle(Integer height) {
        setHeight(height);
        setBase(height);

    }

    private void setHeight(Integer height) {
        // todo: confirm with customer
        //  Assume these validations required
        //  Assume height must be 2 for it be triangle. 1 will be just a dot.

        if (height <= 1) {
            System.out.println("Provided invalid base.");
        }
        this.height = height;
    }

    private void setBase(Integer base) {
        // todo: confirm with customer if prefer exception
        //  Assume these validations required
        //   Assume base must be 2 for it be triangle. 1 will be just a dot or line.

        if (base <= 1) {
            System.out.println("Provided invalid base.");
        }
        this.base = base;
    }


    // If not required to save the output we can just print it out
    // Else the method that saves to string is better for easier testing.
    public void printTriangleByHeight() {
        String printChar = "*";

        // loop to iterate for the given number of rows
        for (int i = 1; i <= height; i++) {
            // loop to print the number of spaces before the star
            for (int j = height; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(printChar+" ");
            }

            // for new line after printing each row
            System.out.println();
        }

    }


    public String stringOutputTriangleByHeight() {
        String printChar = "*";
        StringBuilder printedTriangle = new StringBuilder();

        // loop to iterate for the given number of rows
        for (int i = 1; i <= height; i++) {
            // loop to print the number of spaces before the star
            for (int j = height; j >= i; j--) {
                printedTriangle.append(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                printedTriangle.append(printChar+" ");
            }

            // for new line after printing each row
           printedTriangle.append("\n");
        }
        System.out.print(printedTriangle.toString());
        return printedTriangle.toString();

    }


}


