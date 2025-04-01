package in.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TakingDefaultValueForRequestParam {
    @GetMapping("/forth")
    public String show(@RequestParam Integer no, @RequestParam(defaultValue = "Raj Yadav Ankita ",required = false) String name) {
        System.out.println(no + " " + name);
        return "forthHome";
    }

    /*	 @GetMapping("/data")
		public   String  bindData(@RequestParam("sno")int no,
				                                  @RequestParam("sname") String name) {
			System.out.println(no+"  ....."+name);
			//return  LVN
			return  "show_result";
		}*/

	/*@GetMapping("/data")
	public   String  bindData( @RequestParam(required = false) String sname,@RequestParam int sno) {

		System.out.println(sno+"  ....."+sname);
		//return  LVN
		return  "show_result";
	}*/

	/*@GetMapping("/data")
	public   String  bindData( @RequestParam(defaultValue = "RRR") String sname,
			                                @RequestParam(required = false)  Integer sno) {

		System.out.println(sno+"  ....."+sname);
		//return  LVN
		return  "show_result";
	}*/


	/*@GetMapping("/data")
	public   String  bindData( @RequestParam int sno, @RequestParam String sname,
			                                   @RequestParam (name="sadd") String[]  saddArray,
			                                   @RequestParam (name="sadd") List  saddList,
			                                   @RequestParam (name="sadd") Set  saddSet
			                                      ) {

		System.out.println(sno+"  ....."+sname+"....."+Arrays.toString(saddArray)+"...."+saddList+"...."+saddSet);
		//return  LVN
		return  "show_result";
	}*/

    /*@GetMapping("/data")
    public String bindData(@RequestParam int sno, @RequestParam String sname,
                           @RequestParam(name = "sadd") String sadd
    ) {

        System.out.println(sno + "  ....." + sname + "....." + sadd);
        //return  LVN
        return "show_result";
    }*/
}
