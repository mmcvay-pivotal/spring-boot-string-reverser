package io.pivotal.stringreverser;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringReverserController {

    @RequestMapping(value= "/reverse/{toReverse}", method = RequestMethod.GET)
    public String reverse(@PathVariable("toReverse") String toReverse) {
        	
    		return StringUtils.reverse(toReverse);
    	
    }
    
}
