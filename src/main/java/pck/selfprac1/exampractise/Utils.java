package pck.selfprac1.exampractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import pck.selfprac1.exampractise.models.Cart;

public class Utils {

    public static ArrayList<Cart> deserializeStringCart(String stringCart) {

        if (stringCart.trim().length() <= 0) {
            return new ArrayList<>();
        }

        // so apparently this whole time i was good but the | is a special char in regex
        ArrayList<String> temp = new ArrayList<>(Arrays.asList(stringCart.split("\\|")));

        return temp.stream()
        .map(Cart::stringToCart)
        .collect(Collectors.toCollection(ArrayList::new));
    }

    public static String serializeCartToString(ArrayList<Cart> listOfCarts) {

        return listOfCarts.stream().map(x -> x.cartAttrToStr()).collect(Collectors.joining("|"));
    }
}
