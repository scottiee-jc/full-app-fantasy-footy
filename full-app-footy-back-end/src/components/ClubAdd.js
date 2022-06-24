import { useState } from "react";
import axios from "axios";

const ClubAdd = () => {
    
    const [name, setName] = useState('');
    const [manager, setManager] = useState('');

    const handleNameChange = event => setName(event.target.value);
    const handleManagerChange = event => setManager(event.target.value);

    const handleSubmit = event => {
        
        event.preventDefault();

        const club = {
            "name": name,
            "manager": manager
        }
    

        axios.post('http://127.0.0.1:8080/clubs', club)
            .then(res => {
                console.log(res);
            }).catch((err) => console.log(err));
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <label>
                    Name:
                    <input type="text" name="name" onChange={handleNameChange} />
                </label>
                <label>
                    Manager:
                    <input type="text" name="manager name" onChange={handleManagerChange} />
                </label>
                <button type="submit">Add Cloob</button>
            </form>
        </div>
    );

}

export default ClubAdd;