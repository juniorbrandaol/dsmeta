import axios from "axios";

const BASE_URL = import.meta.env.VITE_BACKEND_URL ?? "http://localhost:8080";

class UserService {


    /********************* SALE ******************/ 
    
    //RETORNA AS VENDAS
    async findAllSalesByDate(minDate:string ,maxDate:string ) {

        return axios({
            url: BASE_URL + "/sales/"+minDate+"/"+maxDate,
            method: "GET",
            headers: {
                "Authorization": "Bearer ",
            }
        }).then((response) => {
            return Promise.resolve(response)
        }).catch((error) => {
            return Promise.reject(error.response.data)
        })
    }

}

const userService = new UserService()
export default userService;