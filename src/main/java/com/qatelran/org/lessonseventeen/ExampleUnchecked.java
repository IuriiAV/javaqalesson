package com.qatelran.org.lessonseventeen;

public class ExampleUnchecked {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 3};
        int index = 4;
        //Unchecked exception
        try {
            int length = numbers.length;
            if ((index - 1) < length) {
                System.out.println(numbers[index]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Incorrect index array");
        }
        PersonService personService = null;
        //printAllPersonInfo(personService);
        String version = null;
        checkVersion(version);
    }

    private static void printAllPersonInfo(PersonService personService) {
        if (personService != null) {
            //Unchecked exception
            personService.getPersonInfo();
        }
    }

    private static void checkVersion(String version) {
        if ("NEW".equals(version)) {
            System.out.println("New version");
        } else {
            System.out.println("Incorrect version");
        }
    }
}