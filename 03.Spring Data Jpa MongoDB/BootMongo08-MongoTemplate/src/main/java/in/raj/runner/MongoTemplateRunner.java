package in.raj.runner;

import in.raj.document.Employee;
import in.raj.service.IEmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoTemplateRunner implements CommandLineRunner {
    @Autowired
    private IEmployService employService;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(1001,"John Doe","123 Main St",75000.0,true);
        String registerEmploy = employService.registerEmploy(employee);
        System.out.println("Result: " + registerEmploy);

        Employee employee1 = new Employee(1002,"Jane Smith","456 Elm St",85000.0,false);
        Employee employee2 = new Employee(1003,"Mike Johnson","789 Oak St",95000.0,true);*//*
        List<Employee> employees = List.of(
                new Employee(1101, "Rajesh Kumar", "12 MG Road, Delhi", 75000.0, true),
                new Employee(1102, "Priya Sharma", "45 Nehru Nagar, Mumbai", 82000.0, false),
                new Employee(1003, "Amit Patel", "78 Park Street, Ahmedabad", 91000.0, true),
                new Employee(1004, "Sneha Reddy", "9 Jubilee Hills, Hyderabad", 88000.0, false),
                new Employee(1005, "Ravi Singh", "34 Civil Lines, Lucknow", 76000.0, true),
                new Employee(1006, "Neha Verma", "56 Sector 22, Chandigarh", 83000.0, false),
                new Employee(1007, "Sanjay Mehta", "102 Main Bazaar, Jaipur", 94000.0, true),
                new Employee(1008, "Kavita Iyer", "88 Indira Nagar, Bengaluru", 85000.0, false),
                new Employee(1009, "Vikram Das", "23 Park Circus, Kolkata", 97000.0, true),
                new Employee(1010, "Anita Nair", "67 Marine Drive, Kochi", 89000.0, false),
                new Employee(1011, "Deepak Yadav", "12 Cantonment, Kanpur", 78000.0, true),
                new Employee(1012, "Pooja Joshi", "44 Tilak Nagar, Bhopal", 86000.0, false),
                new Employee(1013, "Arjun Deshmukh", "89 Shivaji Park, Pune", 91000.0, true),
                new Employee(1014, "Meena Gupta", "21 GT Road, Amritsar", 83000.0, false),
                new Employee(1015, "Naveen Raina", "65 Residency Road, Srinagar", 92000.0, true),
                new Employee(1016, "Rashmi Pandey", "53 Station Road, Varanasi", 81000.0, false),
                new Employee(1017, "Suresh Pillai", "37 Palayam, Thiruvananthapuram", 95000.0, true),
                new Employee(1018, "Divya Menon", "14 MG Road, Kochi", 87000.0, false),
                new Employee(1019, "Harish Bhat", "22 Brigade Road, Bengaluru", 91000.0, true),
                new Employee(1020, "Shweta Tiwari", "71 Mahanagar, Lucknow", 82000.0, false),
                new Employee(1021, "Abhishek Jain", "12 Connaught Place, Delhi", 93000.0, true),
                new Employee(1022, "Ritu Malhotra", "89 Andheri West, Mumbai", 85000.0, false),
                new Employee(1023, "Vivek Agarwal", "43 MI Road, Jaipur", 91000.0, true),
                new Employee(1024, "Anjali Ghosh", "58 Salt Lake, Kolkata", 87000.0, false),
                new Employee(1025, "Manish Kapoor", "90 Sector 18, Noida", 94000.0, true),
                new Employee(1026, "Tina Fernandes", "13 Camp Area, Pune", 81000.0, false),
                new Employee(1027, "Karan Arora", "7 Model Town, Ludhiana", 88000.0, true),
                new Employee(1028, "Snehal Desai", "29 Ellis Bridge, Ahmedabad", 86000.0, false),
                new Employee(1029, "Aakash Khanna", "10 Dadar East, Mumbai", 97000.0, true),
                new Employee(1030, "Nisha Rani", "23 Shastri Nagar, Patna", 78000.0, false),
                new Employee(1031, "Rohit Nair", "14 MG Road, Kochi", 89000.0, true),
                new Employee(1032, "Pallavi Singh", "9 Gomti Nagar, Lucknow", 85000.0, false),
                new Employee(1033, "Sameer Joshi", "66 FC Road, Pune", 92000.0, true),
                new Employee(1034, "Ankita Sharma", "77 Sector 15, Chandigarh", 83000.0, false),
                new Employee(1035, "Vikas Chauhan", "51 Main Street, Delhi", 91000.0, true),
                new Employee(1036, "Preeti Dubey", "18 Hazratganj, Lucknow", 85000.0, false),
                new Employee(1037, "Rahul Shetty", "99 Indiranagar, Bengaluru", 93000.0, true),
                new Employee(1038, "Sonal Patil", "24 Koregaon Park, Pune", 82000.0, false),
                new Employee(1039, "Kunal Bansal", "42 Sector 9, Gurgaon", 95000.0, true),
                new Employee(1040, "Rachita Sen", "30 Ballygunge, Kolkata", 86000.0, false),
                new Employee(1041, "Amitabh Roy", "12 Lake Gardens, Kolkata", 94000.0, true),
                new Employee(1042, "Bhavna Mehra", "5 Green Park, Delhi", 83000.0, false),
                new Employee(1043, "Siddharth Rao", "16 Jubilee Hills, Hyderabad", 91000.0, true),
                new Employee(1044, "Poonam Bedi", "39 Lajpat Nagar, Delhi", 87000.0, false),
                new Employee(1045, "Rakesh Iyer", "25 Bannerghatta Road, Bengaluru", 89000.0, true),
                new Employee(1046, "Swati Pillai", "62 MG Road, Kochi", 82000.0, false),
                new Employee(1047, "Tarun Gaur", "43 Sector 10, Noida", 91000.0, true),
                new Employee(1048, "Nandita Chatterjee", "37 Jadavpur, Kolkata", 86000.0, false),
                new Employee(1049, "Rajiv Nanda", "80 Hauz Khas, Delhi", 94000.0, true),
                new Employee(1050, "Kirti Reddy", "45 Banjara Hills, Hyderabad", 85000.0, false),
                new Employee(1051, "Ajay Tandon", "72 Ashok Vihar, Delhi", 90000.0, true),
                new Employee(1052, "Lata Menon", "63 MG Road, Kochi", 82000.0, false),
                new Employee(1053, "Pradeep Singh", "56 Rajaji Nagar, Bengaluru", 95000.0, true),
                new Employee(1054, "Aarti Deshpande", "29 Deccan, Pune", 88000.0, false),
                new Employee(1055, "Mohan Lal", "19 Civil Lines, Jaipur", 87000.0, true),
                new Employee(1056, "Geeta Kapoor", "14 Andheri East, Mumbai", 85000.0, false),
                new Employee(1057, "Hemant Verma", "41 Sector 17, Chandigarh", 91000.0, true),
                new Employee(1058, "Chitra Nair", "27 Vyttila, Kochi", 83000.0, false),
                new Employee(1059, "Ramesh Babu", "73 T Nagar, Chennai", 92000.0, true),
                new Employee(1060, "Seema Rani", "12 Hazratganj, Lucknow", 82000.0, false),
                new Employee(1061, "Ashok Mishra", "98 Rajpur Road, Dehradun", 88000.0, true),
                new Employee(1062, "Meghna Gaur", "45 Patel Nagar, Delhi", 84000.0, false),
                new Employee(1063, "Gopal Yadav", "60 Cantt Area, Patna", 89000.0, true),
                new Employee(1064, "Sushma Iyer", "77 MG Road, Bengaluru", 85000.0, false),
                new Employee(1065, "Vineet Chawla", "34 Sector 8, Chandigarh", 93000.0, true),
                new Employee(1066, "Anjana Menon", "19 Panampilly Nagar, Kochi", 81000.0, false),
                new Employee(1067, "Lokesh Sharma", "81 GT Road, Kanpur", 92000.0, true),
                new Employee(1068, "Kiran Bedi", "45 Greater Kailash, Delhi", 84000.0, false),
                new Employee(1069, "Sunil Kumar", "53 Law Garden, Ahmedabad", 90000.0, true),
                new Employee(1070, "Rekha Singh", "26 Station Road, Varanasi", 82000.0, false),
                new Employee(1071, "Nitin Chauhan", "70 Connaught Place, Delhi", 95000.0, true),
                new Employee(1072, "Manju Ghosh", "13 New Alipore, Kolkata", 86000.0, false),
                new Employee(1073, "Devendra Joshi", "17 FC Road, Pune", 91000.0, true),
                new Employee(1074, "Kajal Rani", "8 Hazratganj, Lucknow", 83000.0, false),
                new Employee(1075, "Suraj Patel", "47 Ellis Bridge, Ahmedabad", 88000.0, true),
                new Employee(1076, "Mitali Sen", "64 Ballygunge, Kolkata", 84000.0, false),
                new Employee(1077, "Aditya Mehra", "11 Karol Bagh, Delhi", 92000.0, true),
                new Employee(1078, "Neelam Arora", "91 Model Town, Ludhiana", 83000.0, false),
                new Employee(1079, "Harpreet Singh", "42 Civil Lines, Amritsar", 94000.0, true),
                new Employee(1080, "Ayesha Khan", "23 Charminar, Hyderabad", 85000.0, false),
                new Employee(1081, "Jitendra Kumar", "61 Lajpat Nagar, Delhi", 93000.0, true),
                new Employee(1082, "Rina Das", "44 Salt Lake, Kolkata", 84000.0, false),
                new Employee(1083, "Bhavesh Patel", "22 Navrangpura, Ahmedabad", 91000.0, true),
                new Employee(1084, "Payal Nanda", "63 Hauz Khas, Delhi", 82000.0, false),
                new Employee(1085, "Rajeev Sharma", "19 Andheri East, Mumbai", 94000.0, true),
                new Employee(1086, "Komal Gupta", "72 Sector 18, Noida", 85000.0, false),
                new Employee(1087, "Parth Reddy", "15 Jubilee Hills, Hyderabad", 97000.0, true),
                new Employee(1088, "Shruti Pillai", "21 MG Road, Kochi", 83000.0, false),
                new Employee(1089, "Varun Joshi", "55 Camp Area, Pune", 91000.0, true),
                new Employee(1090, "Megha Singh", "33 Civil Lines, Allahabad", 85000.0, false),
                new Employee(1091, "Dinesh Yadav", "26 GT Road, Kanpur", 92000.0, true),
                new Employee(1092, "Ankita Das", "81 Park Circus, Kolkata", 83000.0, false),
                new Employee(1093, "Kishor Iyer", "18 Indiranagar, Bengaluru", 94000.0, true),
                new Employee(1094, "Simran Kaur", "49 Sector 21, Chandigarh", 85000.0, false),
                new Employee(1095, "Rahul Bhatia", "72 Connaught Place, Delhi", 93000.0, true),
                new Employee(1096, "Priti Sinha", "38 Rajendra Nagar, Patna", 84000.0, false),
                new Employee(1097, "Santosh Verma", "66 MI Road, Jaipur", 91000.0, true),
                new Employee(1098, "Isha Kapoor", "27 Bandra West, Mumbai", 85000.0, false),
                new Employee(1099, "Naveen Pillai", "31 MG Road, Kochi", 93000.0, true),
                new Employee(1100, "Ritika Jain", "75 Sector 12, Noida", 82000.0, false)
        );
        String registeredBatchEmploy1 = employService.registerBatchEmploy(List.of(employee1,employee2));
        String registeredBatchEmploy2 = employService.registerBatchEmploy(employees);
        System.out.println("Result: " + registeredBatchEmploy1 + registeredBatchEmploy2);

        employService.findEmployBySalaryRange(50000.00,170000.00).forEach(System.out::println);

        employService.findEmployByAddress("Harigana").forEach(System.out::println);

        System.out.println(employService.findEmployById("68fe11e7cd4780f20896b17d"));
        employService.findEmployBySalaryRangeAndAddress(50000.00,170000000.00,"Harigana","Kanapar").forEach(System.out::println);

        System.out.println(employService.findAndUpdateEmployDataUsingEmployNumber(1001,120000.00,"Bansgaon"));
        System.out.println(employService.findAndUpdateEmployDataUsingEmploySalaryRange(50000.00,90000.00,"Kanaicha"));
        System.out.println(employService.saveOrUpdateEmployDataUsingEmpNum(2,135000.00,"Mahatha"));
    }
}
