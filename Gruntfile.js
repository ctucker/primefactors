
module.exports = function(grunt) {

    grunt.initConfig({

	includes : {
	    files : {
		src: ['src/slideshow.html'],
		dest: 'index.html'
	    }
	},

	copy : {
	    files : {
		cwd: 'src',
		expand: true,
		src: ['**/*', '!slideshow.*'],
		dest: 'slideshow/'
	    }
	},

	watch : {
	    includes : {
			files : ['src/**/*', '!src/diagrams/**/*'],
			tasks : ['copy', 'includes'],
			options: {
				livereload: true
			}
		}
	}
	    
    });

    grunt.loadNpmTasks('grunt-includes');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-copy');

    grunt.registerTask('default', ['copy', 'includes']);
}
