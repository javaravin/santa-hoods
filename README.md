# santa-hoods
The API should return a list of present weights to prepare the hood minimizing the number of items. (eg: [10, 10, 10, 5, 2, 2, 2]. The technical side of the answer is your responsibility and must consider all elven (mis ?) manipulation. 


Request:

The expected endpoint is a /hoodfiller url, accepting a POST request. This request will push a JSON having two parameters: 

 

{ 

  "hood_capacity": 41, 

  "present_weights": [2, 5, 10, 50, 100] 

} 

Response: when input reqeust failed resoponse would be.

Ex:

{
    "error": "present_weights value must be valid"
}


Deployement:

Aproach 1:

Run below commads:
 Create image:
 docker image build -t santa-hoods .
 
 Deploye Image
 docker container run --name santa-hoods -p 8080:8080 -d santa-hoods
 

Approach 2:
 Run directly compose file
 
 
