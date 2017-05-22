/* global describe it */
var expect = require('chai').expect
var valueChecker = require('../../app/lib/value-checker')

describe('value-checker', function () {
  describe('checkValue', function () {
    it('should return message if amount < 100', function () {
      var result = valueChecker.checkValue({value: 99.9})
      expect(result['message']).to.equal('value is less than 100')
    })
    it('should return message if amount >= 100', function () {
      var result = valueChecker.checkValue({value: 100})
      expect(result['message']).to.equal('value is 100 or greater')
    })
    it('should return null for invalid claim', function () {
      var result = valueChecker.checkValue({sausages: 100})
      expect(result).to.equal(null)
    })
  })
})
