var express = require('express')
var valueChecker = require('../lib/value-checker')

module.exports = function (app) {
  var route = express.Router()

  app.use('/', route)

  route.post('/check-value', function (req, res) {
    var result = valueChecker.checkValue(req.body)
    if (result) {
      res.status(200).json(result)
    } else {
      res.status(500).json({error: {message: 'Invalid value'}})
    }
  })
}
