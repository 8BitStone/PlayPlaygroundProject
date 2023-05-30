const path = require('path');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const sveltePreprocess = require('svelte-preprocess');
const sass = require('svelte-preprocess-sass');

module.exports = {
    mode: "development",
    entry: {
        'main': './app/typescript/Loader.ts'
    },
    output: {
        path: path.resolve('./public/bundles'),
        publicPath: '/assets/bundles',
        filename: '[name].js'
    },
    resolve: {
        extensions: ['.ts', '.js', '.scss', '.svelte']
    },
    module: {
        rules: [
            {
                test: /\.(svelte)$/,
                exclude: /node_modules/,
                use: {
                    loader: 'svelte-loader',
                    options: {
                        emitCss: true,
                        preprocess: sveltePreprocess({
                            style: sass.sass({
                                },
                                {
                                    name: 'scss',
                                }),
                            scss: {
                                // We can use a path relative to the root because
                                // svelte-preprocess automatically adds it to `includePaths`
                                // if none is defined.
                                // prependData: `@import './app/templateengine/v2/svelte/stylesheets/var.scss';`,
                            },
                            typescript: {
                                // compilerOptions: {
                                //     "module": "ES6",
                                //     "moduleResolution": "classic"
                                // }
                            }
                        }),
                        // //TODO
                        // includePaths: [
                        //     path.resolve( './app/com/informaticon/svelte/example/stylesheets/var.scss')
                        // ]
                    },
                },
            },

            {
                test: /\.(sa|sc|c)ss$/,
                exclude: /node_modules/,
                use: [
                    'raw-loader',
                    {
                        loader: MiniCssExtractPlugin.loader,
                    },
                    'css-loader?url=false',
                    {
                        loader: "sass-loader",
                        //TODO
                        // options: {
                        //     sassOptions: {
                        //         indentWidth: 4,
                        //         includePaths: [path.resolve("/app/com/informaticon/svelte/example/stylesheets")],
                        //     }
                        // },
                    }
                ]
            },

            {
                test: /\.ts$/,
                use: [{
                    loader: 'ts-loader'
                }]
            }
        ]
    },
    plugins: [
        new MiniCssExtractPlugin({
            filename: "[name].css"
            // filename: isDevelopment ? '[name].css' : '[name].[hash].css',
            // chunkFilename: isDevelopment ? '[id].css' : '[id].[hash].css'
        })
    ],
};