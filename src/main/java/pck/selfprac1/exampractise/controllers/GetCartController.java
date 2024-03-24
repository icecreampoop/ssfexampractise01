package pck.selfprac1.exampractise.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pck.selfprac1.exampractise.Utils;
import pck.selfprac1.exampractise.models.Cart;

@Controller
@RequestMapping
public class GetCartController {
    
    @GetMapping("GetCart")
    public String getCartLogicHandler(Model model, 
    @RequestParam String item, @RequestParam(required = true, defaultValue = "1") int quantity, 
    @RequestParam(required = true, defaultValue = "") String cart123) {

        Cart newItem = new Cart(item,quantity);

        ArrayList<Cart> temp = Utils.deserializeStringCart(cart123);
        temp.add(newItem);

        model.addAttribute("cart", temp);

        model.addAttribute("newCart", Utils.serializeCartToString(temp));

        return "GetCart";
    }

    //i did fck around with trying to implement undo in this but its too much effort
    //and realistically who is using GET to store persistance in actual app??
    //not worth my 2days headache
    @GetMapping("clearCart")
    public String clearCart() {
        return "GetCart";
    }

}
