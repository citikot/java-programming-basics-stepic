package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_5.task_2;

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}