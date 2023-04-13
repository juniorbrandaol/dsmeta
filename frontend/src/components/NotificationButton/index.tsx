import icon from "../../assets/img/notification-icon.svg";
import "./styles.css";
//API
import userService from "../../apiServices/request";

type Props={
   saleId :number;

}

async function handleClick(id: number ){
  
   await userService.sendNotification(id).then(response=>{
      alert("Enviado")  
   })
}

function NotificationButton({saleId}:Props) {
  return (
   <div className="dsmeta-red-btn" onClick={()=> handleClick(saleId)}>
    <img src={icon} alt="Notificar"/>
   </div>
  )
}

export default NotificationButton
