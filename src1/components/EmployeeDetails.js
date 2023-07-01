import {useState,useEffect} from 'react'
const EmployeeDetails=()=>{
    let [empdetails,setempdetails]=useState({});
    let [myaccess,setmyaccss]=useState("")
    useEffect(()=>{
        if(localStorage.empdata!==undefined){
            let emp=JSON.parse(localStorage.getItem("empdata"))
            setempdetails({...emp})
        }
        setmyaccss("admin")
    },[])
    return(
    
        <div>
            <h1>Employee Details</h1>
            Name : {empdetails.name}
            domain : {empdetails.domain}
            gender: {empdetails.gender}
            city : {empdetails.city}
        </div>
    )
}

export default EmployeeDetails;