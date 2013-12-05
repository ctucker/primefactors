describe('canary', function() {
	var canary = new Canary();

	it('squawks when poked', function() {
		expect(canary.soundWhenPoked()).toBe("squawk");
	});
});
