package GYM;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    final private Scanner reader = new Scanner(System.in);
    private int getIntInput(){
        int choise = 0;
        while (choise == 0) {
            try {
                choise = reader.nextInt();
                if(choise == 0)
                    throw new InputMismatchException();
                reader.nextLine();
            }catch (InputMismatchException exception){
                reader.nextLine();
                System.out.print("\nОшибка: неправильный ввод, попробуйте снова");
            }
        }
        return choise;
    }
    private void printClubOptions(){
        System.out.println("\n1) Club Mercury");
        System.out.println("2) Club Neptune");
        System.out.println("3) Club Jupiter");
        System.out.println("4) Multi Clubs");
    }
    public int getChoice(){
        int choice;
        System.out.println("\nWELCOME TO OZONE FITNESS CENTER");
        System.out.println("======================");
        System.out.println("1) Add Member");
        System.out.println("2) Remove Member");
        System.out.println("3) Display Member Information");
        System.out.print("\nPlease select an option (or Enter -1 to quit): ");
        choice = getIntInput();
        return choice;
    }
    public String addMembers(LinkedList<Member> m){
        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

        System.out.print("\nВведите имя посетителя клуба: ");
        name = reader.nextLine();

        printClubOptions();
        System.out.print("\nВведите идентификатор посетителя клуба: ");
        club = getIntInput();

        while (club<1 || club>4){
            System.out.print("\nНеверный идентификатор посетителя клуба, попробуйте еще раз: ");
            club = getIntInput();
        }
        if (m.size()>0)
            memberID = m.getLast().getMemberID() + 1;
        else
            memberID = 1;
        if(club != 4) {
            cal = (n) -> {
                switch (n) {
                    case 1: return 900;   // Club Mercury
                    case 2: return 950;   // Club Neptune
                    case 3: return 1000;  // Club Jupiter
                    default: return -1;
                }
            };
            fees = cal.calculateFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSingle Club посетитель добавлен\n");
        } else {
            cal = (n) -> {
                if (n == 4) return 1200;  // Multi Club
                else return -1;
            };
            fees = cal.calculateFees(club);
            mbr = new MultiClubMember('M', memberID, name, fees, 100); // 100 points as per requirements
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nMulti Club посетитель добавлен\n");
        }
        return mem;
    }

    public void removeMember(LinkedList<Member> m){
        int memberID;

        System.out.print("\nВведите идентификатор посетителя, чтобы удалить: ");
        memberID = getIntInput();

        for (int i = 0; i<m.size();i++) {
            if (m.get(i).getMemberID() == memberID){
                m.remove(i);
                System.out.print("\nПосетитель удален\n");
                return;
            }
        }
        System.out.println("\nИдентификатор посетителя не найден\n");
    }
    public void printMemberInfo(LinkedList<Member> m) {
        int memberID;

        System.out.print("\nВведите идентификатор посетителя, чтобы отобразить информацию: ");
        memberID = getIntInput();

        for (Member member : m) {
            if (member.getMemberID() == memberID) {
                System.out.println("\n\nMember Type = " + member.getMemberType());
                System.out.println("Member ID = " + member.getMemberID());
                System.out.println("Member Name = " + member.getName());
                System.out.println("Membership Fees = " + member.getFees());

                if (member instanceof SingleClubMember) {
                    SingleClubMember scm = (SingleClubMember) member;
                    System.out.println("Club ID = " + scm.getClub());
                } else if (member instanceof MultiClubMember) {
                    MultiClubMember mcm = (MultiClubMember) member;
                    System.out.println("Membership Points = " + mcm.getMembershipPoints());
                }
                return;
            }
        }
        System.out.println("\nИдентификатор посетителя не найден\n");
    }
}
