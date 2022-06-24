import { useState, useEffect } from 'react';
import axios from 'axios';

const ClubList = () => {
    
    const [clubs, setClubs] = useState([]);

    useEffect(() => {
        axios.get('http://127.0.0.1:8080/clubs')
            .then(res => {
                const clubs = res.data;
                setClubs(clubs);
            }).catch((err) => console.log(err));
        }, []
    );

    return(
        <ul>
            {
                clubs.map(club =>
                    <li key={club.id}>{`${club.name}} | ${club.manager}`}</li>
                )
            }
        </ul>
    )
}

export default ClubList;