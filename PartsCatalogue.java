package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartsCatalogue {
    public static void main(String[] args) {

        List<Part> partList = new ArrayList<>();
        partList.add(new Part(430, "Shimano", "MT500"));
        partList.add(new Part(662, "Magura", "MT-7"));
        partList.add(new Part(477, "Magura", "MT-5"));
        partList.add(new Part(115, "JT-Sprocket", "JT48"));
        partList.add(new Part(555, "Shimano", "Nexus"));
        partList.add(new Part(335, "RockShox", "Yari"));
        partList.add(new Part(283, "Fox", "Float"));
        partList.add(new Part(552, "Fox", "36"));
        partList.add(new Part(693, "Manitou", "Circus Expert"));
        partList.add(new Part(112, "Shimano", "SM-RT64"));



        int n = partList.size();
        for(int i = 0; i < partList.size(); i++){
            partList.sort(Comparator.naturalOrder());
            System.out.println(partList.get(i) + " ");

        }

        System.out.println("-------------------");

        //System.out.println(partList.stream().filter(a -> a.getPartNumber() == 112));

        partList.stream().map(Part -> Part.getPartNumber()).forEach(System.out::println);

        System.out.println("-------------------");

        partList.stream().filter(Part -> Part.getPartNumber() == 112).forEach(Part -> System.out.println(Part.toString()));


    }

}
