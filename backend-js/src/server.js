import express from 'express';
import bodyParser from 'body-parser';
import cors from 'cors';

const app = express();
app.use(cors());
app.use(bodyParser.json());

app.get('/api', (req, res) => {
    res.json({ message: 'Hello from server!' });
});
