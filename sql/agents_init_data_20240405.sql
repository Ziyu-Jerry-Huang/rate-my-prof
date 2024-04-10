-- Initialize AI tools values
-- Credit to: https://github.com/ikaijua/Awesome-AITools
-- Snapshot date: 2024-04-05

-- 10 - Closed-source LLMs
INSERT INTO agents (agent_name, url, category_id, description, fee)
VALUES
    ('ChatGPT', 'https://chat.openai.com/', 10, 'OpenAI''s chatgpt', '0'),
    ('New Bing', 'https://www.bing.com/new', 10, 'Microsoft''s new bing.', '0'),
    ('Claude', 'https://www.anthropic.com/product', 10, 'Anthropic''s AI assistant.', '0'),
    ('Gemini', 'https://gemini.google.com/', 10, 'Google''s conversational, AI chat service.', '0'),
    ('Le Chat', 'https://chat.mistral.ai/chat', 10, 'Mistral.ai''s conversational, AI chat service.', '0')
;


-- 11 - Open Source LLMs
INSERT INTO agents (agent_name, url, category_id, description, fee)
VALUES
    ('Llama 2', 'https://ai.meta.com/llama/', 11, 'Llama2 is a large language model developed by Meta AI.', '0'),
    ('Mixtral-8x7B', 'https://github.com/mistralai/mistral-src', 11, 'Mixtral 8x7B, a high-quality sparse mixture of experts model (SMoE) with open weights.', '0'),
    ('grok-1', 'https://github.com/xai-org/grok-1', 11, 'A large language model open sourced by xAI', '0')
;


-- 12 - Writing
INSERT INTO agents (agent_name, url, category_id, description, fee)
VALUES
    ('Notion AI', 'https://www.notion.so/', 12, 'AI-assisted note-taking software', '1'),
    ('Deep L Write', 'https://www.deepl.com/write', 12, 'English and German writing tools to fix writing errors and rewrite sentences promptly.', '0'),
    ('Grammarly', 'https://app.grammarly.com/', 12, 'Edit and correct your grammar, spelling, punctuation, and more with your personal writing assistant, grammar checker, and editor.', '0')
;


-- 13 - Image Creation
INSERT INTO agents (agent_name, url, category_id, description, fee)
VALUES
    ('Midjourney', 'https://www.midjourney.com/', 13, 'Enter text or pictures to create pictures.', '0'),
    ('Photoshop AI', 'https://www.adobe.com/products/photoshop/generative-fill.html', 13, 'Adobe Photoshop generative-fill.', '0'),
    ('Stable diffusion webui', 'https://github.com/AUTOMATIC1111/stable-diffusion-webui', 13, 'Open source project, input text or pictures to create pictures, Stable diffusion webui is the GUI of Stable diffusion, and it is an image user interface that visualizes stable diffusion. It also integrates many other useful extension scripts.', '0'),
    ('civitai', 'https://civitai.com/', 13, 'a website platform for sharing AI image creation model resources, with a large number of models, has become the main model exchange place in the SD open source community', '0'),
    ('clipdrop', 'https://clipdrop.co/', 13, 'clipdrop by stability.ai. Has many AI image processing tools, such as stable diffusion XL, uncrop, reimage XL, stable doodle.', '0'),
    ('firefly', 'https://firefly.adobe.com/', 13, 'Adobe''s AI image processing web site', '0'),
    ('ideogram.ai', 'https://ideogram.ai/', 13, 'Enter text to create pictures. A product developed by a company founded by many ex-Googlers.', '0'),
    ('Skybox AI', 'https://skybox.blockadelabs.com/', 13, 'Generate 360-degree panoramic images using text prompts.', '0'),
    ('DragGAN', 'https://github.com/XingangPan/DragGAN', 13, 'Interactive Point-based Manipulation on the Generative Image Manifold', '0'),
    ('visual-chatgpt', 'https://github.com/microsoft/visual-chatgpt', 13, 'Create images with ChatGPT', '0'),
    ('Microsoft Bing Image Creator', 'https://www.bing.com/images/create', 13, 'Image Creator is a tool for creating pictures using DALL-E technology. Tried Generating portrait pictures is unsightly.', '0'),
    ('remove.bg', 'https://www.remove.bg/', 13, 'Remove Image Background.', '0'),
    ('ControlNet', 'https://github.com/lllyasviel/ControlNet', 13, 'ControlNet is a neural network structure to control diffusion models by adding extra conditions.', '0'),
    ('StreamDiffusion', 'https://github.com/cumulo-autumn/StreamDiffusion', 13, 'A Pipeline-Level Solution for Real-Time Interactive Generation.', '0')
;


-- 14 - Speech Recognition
INSERT INTO agents (agent_name, url, category_id, description, fee)
VALUES
    ('whisper', 'https://github.com/openai/whisper', 14, 'OpenAPI open source robust speech recognition model through large-scale weak supervision.', '0'),
    ('buzz', 'https://github.com/chidiwilliams/buzz', 14, 'An open source desktop software based on OpenAI''s Whisper to recognize speech and generate subtitles.', '0'),
    ('WhisperDesktop', 'https://github.com/Const-me/Whisper', 14, 'Open source, OpenAI-based Whisper, a desktop application for Windows, uses the GPU for processing, which will be faster than on the CPU with good GPU performance.', '0'),
    ('whisperX', 'https://github.com/m-bain/whisperX', 14, 'WhisperX: Automatic Speech Recognition with Word-level Timestamps (& Diarization).', '0'),
    ('whisper-web', 'https://github.com/xenova/whisper-web', 14, 'ML-powered speech recognition directly in your browser. Built with Transformers.js.', '0')
;