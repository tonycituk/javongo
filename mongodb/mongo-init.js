databaseName = 'janvongo-db'

db.auth('root', 'rootpass')
db = db.getSiblingDB(databaseName)

var testcoll = db.getCollection('testcoll')

/*testcoll.insertOne({
    message: 'Just testing'
})*/

db.createUser({
    user: 'javonger',
    pwd: 'javongerpass',
    roles: [
        {
            role: 'readWrite',
            db: databaseName,
        }
    ]
});