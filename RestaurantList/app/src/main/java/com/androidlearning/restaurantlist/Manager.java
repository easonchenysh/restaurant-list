package com.androidlearning.restaurantlist;

public class Manager {
    public static Restaurant restaurants[] = new Restaurant[11];
    public static boolean isInitialization = false;
    public static void Initialization() {
        if (!isInitialization) {
            for (int i = 0;i <= 10;i++) {
                restaurants[i] = new Restaurant();
                restaurants[i].Name = Names[i];
                restaurants[i].Title = Titles[i];
                restaurants[i].Info = Infos[i];
                restaurants[i].icon = Icons[i];
                restaurants[i].id = i;
            }
        }
    }
    public static Restaurant findRestaurantByID(int id) {
        return restaurants[id];
    }
    private static String Names[] = {
            "餐馆0",
            "餐馆1",
            "餐馆2",
            "餐馆3",
            "餐馆4",
            "餐馆5",
            "餐馆6",
            "餐馆7",
            "餐馆8",
            "餐馆9",
            "餐馆10"
    };
    private static String Titles[] = {
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆",
            "这是一家餐馆"
    };
    private static String Infos[] = {
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
            "这家餐馆独有特色,物美价廉,备受顾客喜爱",
    };
    private static int Icons[] = {
            R.drawable.logo3,
            R.drawable.logo1,
            R.drawable.logo2,
            R.drawable.logo3,
            R.drawable.logo4,
            R.drawable.logo1,
            R.drawable.logo4,
            R.drawable.logo2,
            R.drawable.logo3,
            R.drawable.logo2,
            R.drawable.logo1,
    };
}
